import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int T = sc.nextInt();

		boolean flag = false;

		int ans = 10000;

		for(int i=0;i<N;i++) {

			int c = sc.nextInt();

			int t = sc.nextInt();

			if(t<=T && c<ans) {

				ans = c;

				flag = true;
			}
		}

		if(flag == true) System.out.println(ans);

		else System.out.println("TLE");

	}

}
