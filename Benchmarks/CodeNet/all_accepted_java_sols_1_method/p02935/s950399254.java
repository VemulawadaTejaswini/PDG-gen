import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double v[] = new double[N];
		for(int i = 0; i < N; i++) {
			v[i] = sc.nextDouble();
		}
		Arrays.sort(v);
		double ans = (v[0] + v[1]) / 2;
		for(int i = 2; i < N; i++) {
			ans = (ans + v[i]) / 2;
		}
		System.out.println(ans);
	}
}
