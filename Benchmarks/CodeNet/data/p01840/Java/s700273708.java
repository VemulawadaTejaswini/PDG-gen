import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int[] time = new int[10010];
		int ans = 0;
		for(int i=0;i<n;i++){
			time[sc.nextInt()]=1;
		}
		int now = 0;
		for(int i=0;i<t;i++){
			if(time[i]!=0){
				if(now==0){
					ans += Math.max(0,i-m);
					now = i;
				}
				else{
					ans += Math.max(0,i-now-2*m);
					now = i;
				}
			}
		}
		ans += Math.max(0,t-now-m);
		System.out.println(ans);
	}
}