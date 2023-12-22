import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		Arrays.sort(map);
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (sum + map[i] > x) {
				System.out.println(i);
				return;
			}
			sum += map[i];
		}
		
		if (sum == x) {
			System.out.println(N);
		} else {
			System.out.println(N - 1 );
		}
		
	}
}