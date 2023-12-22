import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++){
			int tmp = i;
			int cnt = 0;
			for(;tmp != 0;){
				tmp/=10;
				cnt++;
			}
			if(cnt%2==1){
				ans++;
			}
		}
		System.out.print(ans);
	}
}
