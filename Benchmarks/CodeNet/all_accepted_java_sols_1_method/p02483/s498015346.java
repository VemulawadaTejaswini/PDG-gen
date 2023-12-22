import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)throws IOException
	{
		int tmp;
		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();
		String str3 = in.next();

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Integer.parseInt(str3);

		if(b < a){
			tmp = a;
			a = b;
			b = tmp;
		}
		if(c < b){
			tmp = b;
			b = c;
			c = tmp;
		}
		if(b < a){
			tmp = a;
			a = b;
			b = tmp;
		}

		System.out.println(a + " " + b + " " + c);

	}
}