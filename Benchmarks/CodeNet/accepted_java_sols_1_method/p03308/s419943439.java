import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		Arrays.sort(a);
		System.out.println(a[n - 1] - a[0]);
		sc.close();
	}
	
}


