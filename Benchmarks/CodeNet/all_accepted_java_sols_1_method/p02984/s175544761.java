import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long water[] = new long[num];
		for(int i = 0; i < num; i ++) {
			water[i] = sc.nextLong();
		}
		long ans[] = new long[num];
		long sum = water[num - 1];
		for(int i = 0; i < num - 1; i ++) {
			sum += water[i] * (i % 2 == 0 ? 1 : -1);
		}
		ans[0] = sum / 2;
		System.out.print(ans[0] * 2+" ");
		for(int i = 1; i < num; i ++) {
			ans[i] = water[i - 1] - ans[i - 1];
			System.out.print(ans[i] * 2+" ");
		}
		System.out.println();
	}
}