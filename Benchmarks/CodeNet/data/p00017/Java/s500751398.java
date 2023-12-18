import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
     
    private static String str;
    private static String[] keys = {"the ", "this ", "that "};
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        str = br.readLine();
        
        for(int i=1;i<27;i++){
        	String newStr = decryption((char)i);
        	
        	if(newStr.indexOf(keys[0])!=-1
        			|| newStr.indexOf(keys[1])!=-1
        			|| newStr.indexOf(keys[2])!=-1){
        		System.out.println(newStr);
        		break;
        		
        	}
        
        }
    }
    
    private static String decryption(char cnt){
    	char[] ret = str.toCharArray();
    	
    	for(int i=0;i<str.length();i++){
    		char c = str.charAt(i);
    		if(c == ' ' || c == '.' || c == '\n' ){
    			ret[i] = c;
    		}
    		else {
    			ret[i] = (char)(c - cnt);
    		}
    	}
    	return String.valueOf(ret);
    }
}