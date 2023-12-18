import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a, b, c;
		int tmp;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		
		if (a >= c){
			tmp = a;
			a = c;
			c = tmp;
		}
		if (b >= c){
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a >= b){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println(a + " " + b + " " + c);
	}
}