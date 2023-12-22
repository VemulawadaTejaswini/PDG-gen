import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[t];
		for(int i = 0 ; i < t ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int min = a[t - 1];
		System.out.println(Math.max(min - 1 - (k - min), 0));
	}
}