import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long weight[] = new long[num];
		for(int i = 0; i < num; i ++) {
			weight[i] = sc.nextLong();
		}
		long sum[] = new long[num + 1];
		sum[0] = 0;
		for(int i = 1; i < num + 1; i ++) {
			sum[i] = sum[i - 1] + weight[i - 1];
		}
		long allSum = sum[num];
		long diff[] = new long[num - 1];
		for(int i = 1; i < num; i ++) {
			diff[i - 1] = Math.abs(sum[i] - (allSum - sum[i]));
		}
		long min = Long.MAX_VALUE;
		for(int i = 0; i < num - 1; i ++) {
			min = Math.min(min, diff[i]);
		}
		System.out.println(min);
	}
}