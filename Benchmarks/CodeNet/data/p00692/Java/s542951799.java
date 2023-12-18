
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1110().doIt();
    }
    class aoj1110{
    	TreeSet<String> ts = new TreeSet<String>();
    	ArrayList<String> array = new ArrayList<String>();
    	String pair(String str,int s,int g,int length){
    		if(str.substring(s,s+1).equals(str.substring(g,g+1))){
    			return str.substring(0,s)+str.substring(s+1,g)+str.substring(g+1,length);
    		}
    		return str;
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			String str ="";
    			for(int j = 0;j < 20;j++){
    				str = str+sc.next();
    			}
//    			System.out.println(str);
    			ts.add(str);
    			array.add(str);
    			int min = 20;
//    			System.out.println(array.size());
    			while(array.size() > 0){
//    				System.out.println(array.size());
    				str = array.remove(0);
    				int length = str.length();
    				min = Math.min(min,length);
    				for(int j = 0;j < length;j++){
    					String str2 = "";
    					if(j + 4 < length){
    						str2 = pair(str,j,j+4,length);
    						if(ts.add(str2)){
    							array.add(str2);
    						}
    					}if(j % 4 != 3 && j + 1 < length){
    						str2 = pair(str,j,j+1,length);
    						if(ts.add(str2)){
    							array.add(str2);
    						}
    					}if(j % 4 != 3 && j + 5 < length){
    						str2 = pair(str,j,j+5,length);
    						if(ts.add(str2)){
    							array.add(str2);
    						}
    					}if(j % 4 != 0 && j + 3 < length){
    						str2 = pair(str,j,j+3,length);
    						if(ts.add(str2)){
    							array.add(str2);
    						}
    					}
    				}
    			}
    			ts.clear();
    			System.out.println(min);
    		}
    	}
    }
}