import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int ans = Integer.MAX_VALUE/2;
			for(int i=1;i<n;i++){
				ans = Math.min(ans,a[i]-a[i-1]);
			}
			System.out.println(ans);
		}	
	}
}