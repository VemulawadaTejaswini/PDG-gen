import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char count;
		int i = 0;
		int moji[] = new int[26];
		
		while (sc.hasNextLine()) {
		 String line = sc.nextLine();
       	    		line = line.toLowerCase();
       	   		for (i=0; i<line.length(); i++) {
       	        		count = line.charAt(i);
       	        		if ('a' <= count && count <= 'z'){
       	            			moji[count-'a']++;
       	            		}
       	    		}
       		}
        
        		
        	for(count= 'a'; count <= 'z'; count++){
	        	System.out.println(count + " : "+ moji[i]);
	        }

	}
}