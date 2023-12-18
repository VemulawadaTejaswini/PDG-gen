import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long sum = 1;
		boolean exceed = false;
		boolean zero = false;
		for(int i = 0; i < t; i++) {
			long curr = sum;
			long a = sc.nextLong();
			if(a == 0)
				zero = true;
			sum *= a;
			if(sum > (long)1e18 || curr > sum) {
				exceed = true;
			}
		}
		if(zero)
			System.out.println(0);
		else if(exceed)
			System.out.println(-1);
		else
			System.out.println(sum);
	}
}