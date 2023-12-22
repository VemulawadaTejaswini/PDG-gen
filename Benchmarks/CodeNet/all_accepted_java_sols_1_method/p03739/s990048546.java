import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a[] = new long[(int)n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long sum = a[0];
		long ans1 = 0;
		if(sum == 0) {
			sum = 1;
			ans1++;
		}
		
		for(int i = 1; i < n; i++) {
			if(sum > 0) {
				if(sum + a[i] >= 0) {
					ans1 += sum + a[i] + 1;
					sum = -1;
				} else {
					sum = sum + a[i];
				}
			} else {
				if(sum + a[i] <= 0) {
					ans1 += Math.abs(a[i] + sum) + 1;
					sum = 1;
				} else {
					sum = sum + a[i];
				}
			}
		}
		
		long ans2 = Math.abs(a[0]) + 1;
		if(a[0] >= 0) {
			sum = -1;
		} else if(a[0] < 0){
			sum = 1;
		}
		for(int i = 1; i < n; i++) {
			if(sum > 0) {
				if(sum + a[i] >= 0) {
					ans2 += sum + a[i] + 1;
					sum = -1;
				} else {
					sum = sum + a[i];
				}
			} else {
				if(sum + a[i] <= 0) {
					ans2 += Math.abs(a[i] + sum) + 1;
					sum = 1;
				} else {
					sum = sum + a[i];
				}
			}
		}
		System.out.println(Math.min(ans1, ans2));
	}
}
