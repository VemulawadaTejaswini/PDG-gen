import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		double target = (t - a) / 0.006;
		int rtn = 0;
		double currentMin = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			double diff = Math.abs(target - input);
			if (currentMin > diff) {
				currentMin = diff;
				rtn = i + 1;
			}
		}
		System.out.println(rtn);
	}

}
