import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		if (a > b){
			System.out.println("a > b");
		}
		else if (a < b){
			System.out.println("a < b");
		}
		else {
			System.out.println("a == b");
		}
	}
}