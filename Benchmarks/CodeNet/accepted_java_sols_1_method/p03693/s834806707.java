import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
//https://vjudge.net/contest/159423#problem/B
public class Main {
	public static void main(String [] argv) throws Exception{

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int number = a* 100 + b * 10 + c;
		if (number % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		// R G B
	} 
	


}


