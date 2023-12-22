import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int k = scn.nextInt();
		int ans = (int) (Math.log(n) / Math.log(k)) + 1;
		System.out.println(ans);
	}
}
