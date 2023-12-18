import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long sum = 1;
		long[] arr = new long[t];
		boolean zero = false;
		boolean exceed = false;
		for(int i = 0; i < t; i++) {
			arr[i] = sc.nextLong();
			if(arr[i] == 0)
				zero = true;
		}
		if(zero)
			System.out.println(0);
		else {
			for(int i = 0; i < t; i++) {
				long curr = sum;
				sum *= arr[i];
				if(sum > (long)1e18 || curr > sum) {
					exceed = true;
					break;
				}
			}
		}
		if(exceed)
			System.out.println(-1);
		else
			System.out.println(sum);
	}
}