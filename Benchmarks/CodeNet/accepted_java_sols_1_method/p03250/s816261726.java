import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] n = {a, b, c};
		Arrays.sort(n);
		String s = String.valueOf(n[2]) + String.valueOf(n[1]);
		String t = String.valueOf(n[0]);
		System.out.println(Integer.valueOf(s) + n[0]);
	}
}
