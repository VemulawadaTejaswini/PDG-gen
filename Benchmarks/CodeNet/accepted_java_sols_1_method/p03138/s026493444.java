import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long max = sc.nextLong();
		long val[] = new long[num];
		for(int i = 0; i < num; i ++) {
			val[i] = sc.nextLong();
		}
		int digit = 0;
		double tmp = max;
		while(true) {
			if(tmp / 2.0 >= 1) {
				digit ++;
				tmp /= 2.0;
			}else {
				break;
			}
		}
		long ans = 0;
		long diff[] = new long[digit + 1];
		for(int i = digit; i >= 0; i --) {
			int count = 0;
			for(int j = 0; j < num; j ++) {
				if(Math.floor((val[j] % Math.pow(2, i + 1)) / Math.pow(2, i)) == 1) {
					count ++;
				}else {
					count --;
				}
			}
			diff[i] = count * (long) Math.pow(2, i);
		}
		boolean add[] = new boolean[digit + 1];
		while(true) {
			long maxDiff = 0;
			int index = 0;
			for(int i = 0; i <= digit; i ++) {
				if(add[i] || ans + (long) Math.pow(2, i) > max) {
					continue;
				}
				if(Math.abs(diff[i]) > maxDiff) {
					maxDiff = Math.abs(diff[i]);
					index = i;
				}
			}
			if(maxDiff == 0) {
				break;
			}
			if(diff[index] < 0) {
				ans += (long) Math.pow(2, index);
			}
			add[index] = true;
		}
		long sum = 0;
		for(int i = 0; i < num; i ++) {
			sum += ans ^ val[i];
		}
		System.out.println(sum);
	}
}