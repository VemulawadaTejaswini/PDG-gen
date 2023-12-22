import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int[] Num = new int[N];
		for(int i = 0;i < N;i++) {
			Num[i] = i+1;
		}
		int cnt = 0;
		int max = 0;
		int ans = 0;
		for(int i = 0;i < N;i++) {
			if(N == 1) {
				ans = 1;
				break;
			}
			int k = Num[i];
			while(k%2 == 0) {
				k /= 2;
				cnt++;
			}
			if(max < cnt) {
				max = cnt;
				ans = Num[i];
			}
			cnt = 0;
		}
		System.out.println(ans);
	}
}