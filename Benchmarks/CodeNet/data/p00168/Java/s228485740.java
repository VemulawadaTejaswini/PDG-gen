import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n!=0) {
			System.out.println(solve(n));
			n = sc.nextInt();
		}
	}

	public static int solve(int n) {

		int[] step = new int[Math.max(4, n+1)];
		step[1] = 1;
		step[2] = 2;
		step[3] = 4;
		
		for (int j = 4; j <= n; ++j) {
			step[j] = step[j-1]+step[j-2]+step[j-3];
		}

		if (step[n]%365%10==0) {
			return step[n]/365/10;
		} else {
			return (step[n]/365/10)+1;
		}
	}
}