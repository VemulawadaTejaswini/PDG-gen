import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int min = Integer.MAX_VALUE;
		int ans = Integer.MIN_VALUE;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			ans = Math.max(ans, a - min);
			min = Math.min(min, a);
		}
		System.out.println(ans);
	}

}

