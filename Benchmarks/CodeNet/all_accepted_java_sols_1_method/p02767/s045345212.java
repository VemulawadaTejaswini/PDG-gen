import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		
		int ans_num = Integer.MAX_VALUE;
		for(int i = 1; i <= 100; i++) {
			int num = 0;
			for(int j = 0; j < N; j++) {
				num += Math.pow(i - X[j], 2);
			}
			ans_num = Math.min(num, ans_num);
		}
		
		System.out.println(ans_num);
	}
}
