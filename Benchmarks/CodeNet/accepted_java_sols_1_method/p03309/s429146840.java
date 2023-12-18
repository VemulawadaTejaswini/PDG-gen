import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		long[] n = new long[num];
		for(int i = 0; i < num; i++) {
			n[i] = sc.nextLong() - (long)(i+1);
		}
		Arrays.sort(n);
		long tmp;
		if(num % 2 == 0) {
			tmp = (n[num/2-1]+n[num/2])/2;
		} else {
			tmp = n[num/2];
		}
		long ans = 0;
		for(int i = 0; i < num; i++) {
			ans += Math.abs(n[i]-tmp);
		}
		System.out.println(ans);
	}
}
