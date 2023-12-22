import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 10001;
		long[] a = new long[m];
		a[1] = 2;
		for(int i = 2; i < m; i++) {
			a[i] = a[i - 1] + i;
		}
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(a[n]);
		}
		sc.close();
	}
}
