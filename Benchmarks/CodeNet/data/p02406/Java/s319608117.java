import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			if(i % 3 == 0) {
				System.out.print(" " + i);
			} else if(i % 10 == 3) {
				System.out.print(" " + i);
			}
			int x = i/10;
			if(x % 10 == 3) {
				System.out.print(" " + x);
			}
		}
		System.out.print("\n");
	}
}