
import java.util.*;
public class Main{	
	public static void main(String[] args){
		
		//RLで収束する。RLのうち偶数回目に到着した方が答えになる。
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int ans[] = new int[N];
		for(int i=0;i<N;i++)ans[i]=0;
		char before ='R';
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if(before=='R') {
				if(S.charAt(i)=='R')cnt++;
				else {//Lの時
					ans[i-1]+=(cnt+1)/2;
					ans[i]+=cnt/2;
					before='L';
					cnt=1;
				}
			}else {//beforeがLの時
				if(S.charAt(i)=='L')cnt++;
				else {//Rの時
					ans[i-cnt]+=(cnt+1)/2;
					ans[i-cnt-1]+=cnt/2;
					before='R';
					cnt=1;
				}
			}
		}
		ans[N-cnt]+=(cnt+1)/2;
		ans[N-cnt-1]+=cnt/2;
		
		StringBuilder sb = new StringBuilder();
		for(int tmp:ans) sb.append(tmp+" ");
		System.out.println(sb.toString());
	}
}
