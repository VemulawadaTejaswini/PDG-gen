import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    
	public static void main(String args[]){
	    
    	Scanner in = new Scanner(System.in);
      	char c = in.next().charAt(0);
		
		if((int)c > 64 && (int)c <91)
			System.out.println("A");
		else
			System.out.println("a");
		
    }
 
}