import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		long b = 0, c = 0;
		
		for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if (a[i] > c) {
                c = a[i];
            }
		}
    
        for (int i = 0; i < N; i++) {
            int n = a[i];
            b = 0;
            while (n % 2 == 0 && n > 0) {
                n = n / 2;
                b++;
            }
            if (b < c) {
                c = b;
            }
        }
		
		System.out.println(c);

		sc.close();
	}
}
