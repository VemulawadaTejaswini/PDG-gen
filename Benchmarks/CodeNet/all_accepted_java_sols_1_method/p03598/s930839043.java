import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		long sum = 0l;
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			sum += 2*Math.min(a[i], Math.abs(a[i] - k));
		}
		System.out.println(sum);
		sc.close();
	}

}
