
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int cost = 10000;
		for (int i=0;i<N;i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			if (t<=T&&c<cost) {
				cost = c;
			}
		}
		if (cost==10000) {
			System.out.println("TLE");
		} else {
		System.out.println(cost);
		}
	}
}