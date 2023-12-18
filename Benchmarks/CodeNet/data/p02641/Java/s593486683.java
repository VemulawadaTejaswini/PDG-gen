import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); //整数
		int N = sc.nextInt(); //長さNの整数列
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		int num = 1;
		int ans=0;
		int i = 0;
		
		do {
			int num_g = 0;
			
			if(i%2 == 0) {
				//左部の検索
				for (int j = 0; j < N; j++) {
					if ((X - num) != p[j]) {
						num_g++;
					}
				}
				if ( num_g == N)
					ans = X - num; //答え
				
			}
			else
			{
				//右部の検索
				for (int j = 0; j < N; j++) {
					if ((X + num) != p[j]) {
						num_g++;
					}
				}
				if ( num_g == N)
					ans = X + num; //答え
			}
		i = i + 1;
		} while(ans == 0 || i < 50);
		
		System.out.println(ans);

	}

}