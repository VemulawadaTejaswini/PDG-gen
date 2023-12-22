
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int max = 0;
		for(int i=0;i<=k;i++){
			for(int j=0;j<=k-i;j++){
				int x = a*(int)Math.pow(2,i) + b*(int)Math.pow(2,j) + c*(int)Math.pow(2,k-i-j);
				max = (int)Math.max(max, x);
			}
		}
		System.out.println(max);
	}
}
