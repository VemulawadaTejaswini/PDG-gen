import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		sc.close();

		int P = Integer.parseInt(spl[0]);
		int Q = Integer.parseInt(spl[1]);
		int R = Integer.parseInt(spl[2]);
		int A = P + Q;
		int sum1 = P + Q;
		int sum2= Q + R;
		int sum3 = R + P;
		int ans = 0;
		ans = Math.min(sum1, sum2);
		ans = Math.min(ans, sum3);
		System.out.println(ans);
	}
}