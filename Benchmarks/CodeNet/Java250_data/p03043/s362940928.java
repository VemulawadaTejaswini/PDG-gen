
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double dice=1/(double)N;
		double ans=0;

		for(int i=1;i<=N;i++) {
			int n=i;
			double m=dice;
			while(n<K) {
				n *= 2;
				m /= 2.0;
			}
			ans += m;
		}

		System.out.println(ans);

	}


}