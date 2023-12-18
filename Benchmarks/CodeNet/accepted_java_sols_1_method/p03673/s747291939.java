import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int[]b = new int[n];
		if(n % 2 == 0) {
			int k = n / 2;
			for(int i = 0; i < n / 2; i++) {
				int id1 = k + i;
				int id2 = k - 1 -  i;
				b[id1] = a[2 * i];
				b[id2] = a[2 * i + 1];
			}
		}else {
			int k = n / 2;
			b[k] = a[0];
			for(int i = 0; i < n / 2; i++) {
				int id1 = k + i + 1;
				int id2 = k - 1 -  i;
				b[id1] = a[2 * i + 1];
				b[id2] = a[2 * i + 2];
			}

		}
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(b[i]);
			}else {
				System.out.print(b[i] +" ");
			}
		}
	}
}