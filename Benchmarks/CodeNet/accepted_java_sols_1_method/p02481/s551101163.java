import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
		int a = 0;
		int b = 0;
		Scanner in = new Scanner(System.in);
		String p = in.next();
		String q = in.next();
		a = Integer.parseInt(p);
		b = Integer.parseInt(q);
		int area = 0;
		int length = 0;
		area = a * b;
		length = 2 * a + 2 * b;
		System.out.println(area + " " + length);
	}
}