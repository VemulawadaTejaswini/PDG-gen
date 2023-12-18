import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int S = scan.nextInt();
		long[]a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		scan.close();
		int min = Integer.MAX_VALUE;
		long sum = 0;
		int right = 0;
		for(int left = 0; left < N; left++) {
			while(right < N && sum + a[right] < S){
				sum += a[right];
				right++;
			}
			if(right < N) {
				if(sum + a[right] >= S) {
					int l = right - left + 1;
					min = Math.min(min, l);
				}
			}

			if(right == left) {
				right ++;
			}else {
				sum -= a[left];
			}
		}
		if(min == Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(min);
		}
	}
}
