
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] sum = new int[1000];
		sum[0] = 0;
		for(int i = 1; i < 1000; i++) {
			sum[i] = sum[i - 1] + i;
		}
		int ans = sum[b - a] - b;
		System.out.println(ans);
	}

}
