import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] p = new int[n+1];
		
		int wrong = 0;
		for ( int i = 1; i <= n; i++ ) {
			p[i] = in.nextInt();
			if(p[i] != i) wrong++;
		}
		
		if(wrong <= 2)System.out.println("YES");
		else System.out.println("NO");
		
		
		in.close();
	}
}