import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		
		while (true){
			try {
				a = stdIn.nextInt();
			} catch (Exception e){
				return;
			}
			b = stdIn.nextInt();
			
			int sum = a + b;
			int count = 0;
			while (sum > 0){
				sum /= 10;
				count++;
			}
			System.out.println(count);
		}
	}
}