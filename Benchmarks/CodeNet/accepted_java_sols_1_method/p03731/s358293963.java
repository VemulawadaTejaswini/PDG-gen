
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int t=0;
		int t_old=0;
		int stopTime=0;
		for (int i=1;i<=N;i++) {
			t = sc.nextInt();
			if (t-t_old>T) {stopTime += t-t_old-T;}
			t_old = t;
		}

		System.out.print(t+T-stopTime);

	}
}