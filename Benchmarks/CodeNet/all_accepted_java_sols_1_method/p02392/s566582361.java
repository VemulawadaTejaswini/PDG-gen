import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String A,B,C;
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		A = in.next();
		B = in.next();
		C = in.next();
		
		a = Integer.parseInt(A);
		b = Integer.parseInt(B);
		c = Integer.parseInt(C);
		
		if(a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}