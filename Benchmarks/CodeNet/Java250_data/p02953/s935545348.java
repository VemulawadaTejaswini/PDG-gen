import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[scan.nextInt()];
		String str = "Yes";
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		for (int i = n.length - 1; 0 < i; i--) {
			if (n[i - 1] > n[i]) {
				n[i - 1] = n[i - 1] - 1;
			}
		}
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i + 1] < n[i]) {
				str = "No";
			}
		}
		System.out.println(str);
	}
}