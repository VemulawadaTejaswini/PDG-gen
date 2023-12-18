import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch;
		int i = 0;
		int moji[] = new int[256];
		
		while (sc.hasNextLine()) {
		 	String line = sc.nextLine();
       	    		for (i= 0; i < line.length(); i++){
			        ch= Character.toLowerCase(line.charAt(i));
			        moji[ch] = moji[ch] + 1;
 			}
       		}
        
        	for(ch= 'a'; ch <= 'z'; ch++){
	        	System.out.println(ch + " : "+ moji[ch]);
	        }

	}
}