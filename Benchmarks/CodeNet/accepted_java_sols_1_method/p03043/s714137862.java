import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double ans = 0.0;
		for (int i = 1; i <= N; i++) {
			double tmp = 1.0/N;
			int now = i;
			while (now < K) {
				now *= 2;
				tmp /= 2;
			}
			ans += tmp;
		}
		System.out.println(ans);
	}
}