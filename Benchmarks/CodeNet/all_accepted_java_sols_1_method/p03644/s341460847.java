import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		int nmax = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			boolean f = true;
			int a = i;
			while (f) {
				if (a%2==0) {
					count++;
					a = a/2;
					continue;
				}
				if (a%2==1) {
					if (max <= count) {
						max = count;
						nmax = i;
					}
					f = false;
				}
			}
		}
		System.out.println(nmax);
	}
}
