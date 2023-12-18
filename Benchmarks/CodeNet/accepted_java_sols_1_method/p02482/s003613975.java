import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		long a = Long.parseLong(in.next());
		long b = Long.parseLong(in.next());
		
		if (a == b) {
			System.out.println("a == b"); 
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
	}
}