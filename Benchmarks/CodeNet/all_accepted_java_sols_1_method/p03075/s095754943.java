import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		if (a[4] - a[0] <= k) {
			sb.append("Yay!");
		} else {
			sb.append(":(");
		}
		System.out.println(sb);
	}
}