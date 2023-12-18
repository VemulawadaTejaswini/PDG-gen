import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	while(sc.hasNextLine()){
    		new D().doIt();
    	}
    }
    class D{
    	void doIt(){
    		String str = sc.nextLine();
    		str = str.toUpperCase();
    		str = str.replaceAll("[^A-Z]", "");
//    		System.out.println(str);
    		ans(str,str.length());
    	}
    	void ans(String str,int length){
    		TreeSet<String> ts = new TreeSet<String>();
    		TreeSet<String> ts2 = new TreeSet<String>();
    		for(int i = 1;i < length - 1;i++){
    			String ss = "";
    			String ss2 = "";
    			for(int j = 1;j < length;j++){
    				if(str.charAt(i-j) == str.charAt(i+j)){
    					ss2 = ss;
    					ss = str.substring(i-j,i+j+1);
    					ts2.add(ss2);
//    					System.out.println(ss);
    				}else{
    					if(ss.equals(""))break;
    					ts.add(ss);
    					break;
    				}
    				if(i-j == 0 || i +j == length-1){
    					if(ss.equals(""))break;
    					ts.add(ss);
    					break;
    				}
    			}
    			ss = "";
    			ss2 = "";
    			if(str.charAt(i) == str.charAt(i+1)){
    				for(int j = 1;j < length;j++){
    					if(i+j+1 == length)break;
        				if(str.charAt(i-j) == str.charAt(i+j+1)){
        					ss2 = ss;
        					ss = str.substring(i-j,i+j+2);
        					ts2.add(ss2);
        				}else{
        					if(ss.equals(""))break;
        					ts.add(ss);
        					break;
        				}
        				if(i - j == 0 || i + j == length-1){
        					if(ss.equals(""))break;
        					ts.add(ss);
        					break;
        				}
        			}
    			}
    		}
    		if(ts.size() > 0){
    			System.out.print(ts.pollFirst());
    		}
    		int size = ts.size();
    		for(int i = 0;i < size;i++){
    			String s = ts.pollFirst();
                if(!ts2.contains(s)){
                	System.out.print(" "+s);
                }
    		}
    		System.out.println();
    	}
    }
}