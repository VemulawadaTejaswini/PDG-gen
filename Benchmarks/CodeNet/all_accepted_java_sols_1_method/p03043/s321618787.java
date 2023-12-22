import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int point;
		double kakuritu = 1.0000000000;
		double ans = 0.0000000000;
		for(int i=1;i<=N;i++){
			kakuritu = 1.0000000000/N;
			point = i;
			while(point<K){
				kakuritu *= 0.5;
				point *= 2;
			}
			ans += kakuritu;
		}
		sc.close();
		System.out.println(ans);
	}
};
