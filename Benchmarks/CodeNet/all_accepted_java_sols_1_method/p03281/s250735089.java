import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int ans = 0;

		for(int j = 1; j<=N; j=j+2){
				cnt = 0;
			for(int i = 1; i<=j; ++i){
				if(j%i == 0){
					++cnt;
				}
			}
			if(cnt == 8) ++ans;
		}

		System.out.println(ans);
	}
}