import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long attack = 0;
		long[] num = new long[(int) N];
		for(int i = 0;i < N;i++) {
			num[i] = sc.nextInt();
		}
		if(N <= K) {
			System.out.println("0");
		}else {
			Arrays.sort(num);
			for(int j = 1;j <= K;j++) {
				num[(int) (N-j)] = 0;
			}
			for(int k = 0;k < N;k++) {
				attack += num[k];
			}
			System.out.println(attack);
		}
	}
}