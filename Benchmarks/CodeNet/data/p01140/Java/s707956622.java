import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			else calc(n, m);
			
		}
	}
	public void calc(int n, int m){
		sums = new int[n+1][m+1];
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < m+1; j++){
				sums[i][j] = -1;
			}
		}
		int[] h = new int[n+1];
		int[] w = new int[m+1];
		for(int i = 1; i < n+1; i++){
			h[i] = sc.nextInt();
		}
		for(int i = 1; i < m+1; i++){
			w[i] = sc.nextInt();
		}
		iter (h, w, n, m);
		System.out.println(sums[n][m]);
	}
	
	int[][] sums;
	public int iter(int[] h, int[] w, int ih, int iw){
		if(ih == 0 || iw == 0){
			return 0;
		}
		else if(sums[ih][iw] != -1) return sums[ih][iw];
		else{
			int nh = h[ih];
			int nw = w[iw];
			int i = ih-1;
			int j = iw-1;
			int sum = 0;
			while(i >=0 || j >= 0){
				if(nh == nw){
					sum++;
					if(i > 0){
						nh += h[i];
						i--;
					}
					else if(j > 0){
						nw += w[j];
						j--;
					}
					else break;
				}
				else if(j < 0 || (nh < nw && i > 0)){
					nh += h[i];
					i--;
				}
				else{
					nw += w[j];
					j--;
				}
			}
			int c = sums[ih-1][iw-1];
			if(c == -1) c = iter(h, w, ih-1, iw-1);
			int a = sums[ih-1][iw];
			if(a == -1) a = iter(h, w, ih-1, iw);
			int b = sums[ih][iw-1];
			if(b == -1) b = iter(h, w, ih, iw-1);
			int t =  a + b - c + sum;
			sums[ih][iw] = t;
			return t;
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}