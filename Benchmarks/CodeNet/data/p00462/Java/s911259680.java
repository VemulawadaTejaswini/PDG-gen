import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			 int d = sc.nextInt();
			 if(d == 0) break;
			 int n = sc.nextInt()-1;
			 int m = sc.nextInt();
			 int[] dd = new int[n];
			 int[] kk = new int[m];
			 int[] kpx = new int[m];
			 for(int i = 0; i < n; i++) {
				 dd[i] = sc.nextInt();
			 }
			 for(int i = 0; i < m; i++) {
				 kk[i] = sc.nextInt();
			 }
			 Arrays.sort(dd);
			 Arrays.sort(kk);
			 Data[] list = new Data[n + m + 1];
			 int dp = 0;
			 int kp = 0;
			 int p =  0;
			 list[p++] = new Data(0,true);
			 while(dp != n || kp != m) {
				 if(dp != n && kp != m) {
					 if(dd[dp] < kk[kp]) {
						 list[p++] = new Data(dd[dp++],true);
					 }
					 else {
						 kpx[kp] = p;
						 list[p++] = new Data(kk[kp++],false);
					 }
				 }
				 else if(kp != m) {
					 kpx[kp] = p;
					 list[p++] = new Data(kk[kp++],false);
				 }
				 else {
					 list[p++] = new Data(dd[dp++],true);
				 }
			 }
			 int sum = 0;
			 for(int i = 0; i < m; i++) {
				 int l = -1;
				 int r = -1;
				 for(int j = kpx[i]-1; j >= 0; j--) {
					if(list[j].isS) {
						l = list[j].p;
						break;
					}
				 }
				 if(l == -1) {
					 l = dd[n-1];
				 }
				 for(int j = kpx[i]+1; j < n + m + 1; j++) {
					 if(list[j].isS) {
						 r = list[j].p;
						 break;
					 }
				 }
				 if(r == -1) {
					 r = d;
				 }
				 int s = list[kpx[i]].p;
				 
				 int min = Math.min(Math.min(Math.abs(s - l), Math.abs(s - l - d)), Math.min(Math.abs(s - r), Math.abs(s - r)));
				 sum += min;
			 }
			 System.out.println(sum);
		}
		
	}
	static class Data {
		int p;
		boolean isS;
		Data(int a, boolean b) {
			p = a;
			isS = b;
		}
	}
	
	
	
}