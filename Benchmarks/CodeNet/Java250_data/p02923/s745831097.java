import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] H = new long[N];
		for(int i = 0;i < N;i++) {
			H[i] = Long.parseLong(sc.next());
		}
		sc.close();
		int[] d = new int[N];
		int cnt = 0;
		for(int i = 0;i < N-1;i++) {
			if(H[i] >= H[i+1]) {
				cnt++;
			}else {
				cnt = 0;
			}
			d[i] = cnt;
		}
		Arrays.sort(d);
		System.out.println(d[N-1]);
	}
}