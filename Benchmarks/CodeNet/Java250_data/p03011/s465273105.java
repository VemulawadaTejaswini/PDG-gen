import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int result_1 = P + Q;
		int result_2 = Q + R;
		int result_3 = R + P;
		int output = Math.min(result_1,(Math.min(result_2,result_3)));
      System.out.println(output);
	}
}