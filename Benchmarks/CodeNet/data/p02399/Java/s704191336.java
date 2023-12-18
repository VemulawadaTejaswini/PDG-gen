import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a/b;
		int r = a%b;
		double f = 1.0 * a / (1.0 * b);
		System.out.println(d+" "+r+" "+f);
	}
}