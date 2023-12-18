import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		long[]a = new long[N];
		long[]x = new long[Q];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		for(int i = 0; i < Q; i++) {
			x[i] = scan.nextLong();
		}
		scan.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Q; i++) {
			long cnt = 0;
			long sum = 0;
			int right = 0;
			for(int left = 0; left < N; left++) {
				while(right < N && sum + a[right] <= x[i]) {
					sum += a[right];
					right++;
				}
				cnt += (right - left);
				if(left == right) {
					right++;
				}else {
					sum -= a[left];
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb.toString());
	}
}
