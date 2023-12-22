import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long a[] = new long[num + 1];
		long sum = 0;
		for(int i = 0; i <= num; i ++) {
			a[i] = sc.nextLong();
			sum += a[i];
		}
		long b[] = new long[num];
		for(int i = 0; i < num; i ++) {
			b[i] = sc.nextLong();
		}
		for(int i = 0; i < num; i ++) {
			if(b[i] > a[i]) {
				a[i + 1] = Math.max(0, a[i + 1] - (b[i] - a[i]));
				a[i] = 0;
			}else {
				a[i] = a[i] - b[i];
			}
		}

		long sum2 = 0;
		for(int i = 0; i <= num; i ++) {
			sum2 += a[i];
		}

		System.out.println(sum - sum2);
	}
}