import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		sc.close();
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			n[i] = Integer.parseInt(num[i]);
		}
		int start = Math.max(n[0], n[2]);
		int end = Math.min(n[1], n[3]);
		System.out.println(end > start ? end - start : 0);
	}
}