import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
  		Scanner in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		String C = in.next();
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		int c = Integer.parseInt(C);

		int count = 0;

		for(int i = a; i < b + 1; i++){
	      	if(c % i == 0){
	        	count++;
	      	}
    	}
    	
    	System.out.println(count);
	}
}