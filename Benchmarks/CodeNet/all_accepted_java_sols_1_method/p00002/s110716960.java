import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
	    	Scanner in = new Scanner(System.in);
	    	
	    	while(in.hasNextInt()) {
	    		int a = in.nextInt();
	    		int b = in.nextInt();
	    		a += b;
	    		int numDigit = String.valueOf(a).length();
	    		System.out.println(numDigit);
	    	}
    }
}