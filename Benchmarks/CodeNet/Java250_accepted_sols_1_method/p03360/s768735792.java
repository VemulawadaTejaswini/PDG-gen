import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			a[2] = a[2] * 2;
		}
		System.out.println(a[0] + a[1] + a[2]);
	}
}
