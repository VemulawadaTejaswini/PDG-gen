import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int Prod = a * b;
		if(Prod % 2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}