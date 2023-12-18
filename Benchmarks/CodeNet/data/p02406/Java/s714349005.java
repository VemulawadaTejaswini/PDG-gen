import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			int a = i/10;
			int b = a/10;
			int c = b/10;
			int d = c/10;
			int e = d/10;
			if(i % 3 == 0) {
				System.out.print(" " + i);
			} else if(i % 10 == 3) {
				System.out.print(" " + i);
			} else if(a % 10 == 3) {
				System.out.print(" " + i);
			} else if(b % 10 == 3) {
				System.out.print(" " + i);
			} else if(c % 10 == 3) {
				System.out.print(" " + i);
			} else if(d % 10 == 3) {
				System.out.print(" " + i);
			} else if(e % 10 == 3) {
				System.out.print(" " + i);
			}
		}
	}
}