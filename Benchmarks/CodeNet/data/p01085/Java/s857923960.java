import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int nmin = sc.nextInt();
			int nmax = sc.nextInt();
			if(m==0 && nmin==0 && nmax==0){
				break;
			}
			int[] p = new int[m];
			for(int i=0;i<m;i++){
				p[i] = sc.nextInt();
			}
			Arrays.sort(p);
			
			int nans = 0;
			int gap = -1;
			for(int i=nmax;i>=nmin;i--){
				if(gap<p[m-i]-p[m-i-1]){
					nans = i;
					gap = p[m-i]-p[m-i-1];
				}
			}
			System.out.println(nans);
		}	
	}
}