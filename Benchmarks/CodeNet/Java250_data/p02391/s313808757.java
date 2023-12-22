import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String A,B;
		int a,b;
		
		Scanner in = new Scanner(System.in);
		
		A = in.next();
		B = in.next();
		
		a = Integer.parseInt(A);
		b = Integer.parseInt(B);
		
		if(a > b){
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}
}