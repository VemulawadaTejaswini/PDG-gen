
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}	
		int max = -1000000000;
		int nowm = num[0];
		for(int i=1;i<n;i++){
			max = (int)Math.max(max, num[i] - nowm);
			nowm = (int)Math.min(nowm, num[i]);	
		}

		System.out.println(max);
	}
}


