import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	String in=br.readLine();
			if(in.equals("0 0")) break;
            String[] a=in.split(" ");
            int n=Integer.parseInt(a[0]);
            int x=Integer.parseInt(a[1]);
            
            List<String> l = new ArrayList<String>(); 
        	for(int i=1;i<=n;i++){
            	for(int j=1;j<=n;j++){
                	for(int k=1;k<=n;k++){
                		if(i!=j&&j!=k&&k!=i&&i+j+k==x){
                			String s=sort(""+i+j+k);
                			if(l.indexOf(s)==-1) l.add(s);
                		}
                	}
            	}
        	}
        	System.out.println(l.size());
        }
	}
	
	static String sort(String str){
		StringBuilder sb=new StringBuilder(str);
		if(sb.charAt(0)>sb.charAt(1)){
			sb.insert(2,sb.charAt(0));
			sb.deleteCharAt(0);
		}
		if(sb.charAt(1)>sb.charAt(2)){
			sb.insert(1,sb.charAt(2));
			sb.deleteCharAt(3);
		}
		if(sb.charAt(0)>sb.charAt(1)){
			sb.insert(2,sb.charAt(0));
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}