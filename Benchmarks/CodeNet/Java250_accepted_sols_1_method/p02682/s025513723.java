import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		long sum = 0;
		while (K != 0 && a[0] > 0) {
			sum += 1;
			--K;
			a[0]--;
		}
		while (K != 0 && a[1] > 0) {
			a[1]--;
			--K;
		}
		while (K != 0 && a[2] > 0) {
			sum -= 1;
			a[2]--;
			--K;
		}
		System.out.println(sum);
	}
}
