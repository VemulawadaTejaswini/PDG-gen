import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
   
   
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		
		int A = a * p;
		int B = b + Math.max(p - c, 0) * d;
		
		System.out.println(Math.min(A, B));
		
		
		
	}
	
}