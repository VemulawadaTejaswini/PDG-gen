import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	 public static void main (String[] args) throws IOException	{
		 InputStreamReader is = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(is);                    
	     int cnt=0,cnt1=0;
	     while(true){
	    	 String str= br.readLine();
	    	 for(int i=0;i<str.length()-1;i++){
	    		 if(str.charAt(i)=='J'){
	    			 if(str.charAt(i+1)=='O'){
	    				 if(str.charAt(i+2)=='I'){
	    					 cnt++;
	    				 }
	    			 }
	    		 }
	    		 else if(str.charAt(i)=='I'){
	    			 if(str.charAt(i+1)=='O'){
	    				 if(str.charAt(i+2)=='I'){
	    					 cnt1++;
	    				 }
	       			}
	       		}
	     	}
	     	System.out.println(cnt);
	    	System.out.println(cnt1);
	     }
	 }
}