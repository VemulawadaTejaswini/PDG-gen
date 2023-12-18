import java.io.*;
import java.util.*;

public class Main{
    public static boolean oppSide(char c1, char c2){
    	final Character[] right= {'y','u','i','o','p','h','j','k','l','n','m'};
    	
    	return ( !Arrays.asList(right).contains(c1) && Arrays.asList(right).contains(c2) )
    		    || ( Arrays.asList(right).contains(c1) && !Arrays.asList(right).contains(c2) );
    }
	
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while( !( (str= br.readLine()).equals("#") ) ){
        	int cnt= 0;        	
            for(int i=1; i<str.length(); i++){
            	if( oppSide(str.charAt(i-1),str.charAt(i)) ){
            		cnt++;
            	}
            }
            System.out.println(cnt);
        }
    }
}