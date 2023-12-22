import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        
        if (p <= q && q <= r) {
            System.out.println((p + q));
        } else if (p <= r && r <= q) {
            System.out.println((p + r));
        } else if (q <= p && p <= r) {
            System.out.println((q + p));
        } else if (q <= r && r <= p) {
            System.out.println((q + r));
        } else if (r <= p && p <= q) {
            System.out.println((r + p));
        } else if (r <= q && q <= p) {
            System.out.println((r + q));
        }

		sc.close();
	}
}
