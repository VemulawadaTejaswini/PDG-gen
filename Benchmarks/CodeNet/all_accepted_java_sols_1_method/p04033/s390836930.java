import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(tok.nextToken());
		int b = Integer.parseInt(tok.nextToken());
		if(a > 0 && b > 0) System.out.println("Positive");
		else if( a==0 || b == 0 ) System.out.println("Zero");
		else if(a < 0 && b < 0){
			int c = Math.abs(Math.abs(a) - Math.abs(b));
			System.out.println(c%2==0? "Negative" : "Positive");
		}
		else System.out.println("Zero");
	}
}
