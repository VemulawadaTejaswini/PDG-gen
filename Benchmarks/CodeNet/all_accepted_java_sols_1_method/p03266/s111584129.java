import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		long ans = 0;
		for(int a = 1;a <= N;++a) {
			int b = K-a;
			if(b <= 0)
				b += (-b / K + 1)*K;
			if((b + b) % K != 0)continue;
			if(b > N)continue;
			
			ans += (long)((N - b)/K + 1) * (long)((N - b)/K + 1);
		}
		System.out.println(ans);
	}
}
