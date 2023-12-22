import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = new Scanner(System.in);		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a < b) System.out.println("a < b");
		else if(a > b) System.out.println("a > b");
		if(a == b) System.out.println("a == b");
	}
}