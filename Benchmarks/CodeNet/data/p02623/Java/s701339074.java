import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		long[][] desk1 = new long[N][N];
		long[][] desk2 = new long[M][M];
		long t = 0;
		int pos = -1;
		int index = 0;
		long max = 0;
		long cost = 0;
		for(int i = 0 ; i<N; i++) {
			t+=sc.nextInt();
			desk1[i][0] = t;
			desk1[i][1] = i+1;
			if(t<K) {
				if(max < desk1[i][1]) {
					max = desk1[i][1];
					pos = 1;
					index = i;
					cost = desk1[i][0];
				}
			}
		}
		t = 0;
		for(int i = 0 ; i<M; i++) {
			//System.out.println("t = " + t);
			t+=sc.nextInt();
			desk2[i][0] = t;
			desk2[i][1] = i+1;
			if(t<K) {
				if(max < desk2[i][1]) {
					//System.out.println("TTT");
					max = desk2[i][1];
					pos = 2;
					index = i;
					cost = desk2[i][0];
				}
			}
		}
		if(pos == 1) {
			//System.out.println("T");
			for(int i = 0 ; i<M; i++) {
				if(desk2[i][0] + cost > K) {
					max += i;
					break;
				}
			}
		}
		else if(pos == 2) {
			//System.out.println("T2");
			for(int i = 0 ; i<N; i++) {
				//System.out.println(desk1[i][0]+"  " + cost + " " + K);
				if(desk1[i][0] + cost >= K) {
					//System.out.println("i = " + i);
					max += i;
					if(i == N-1) {
						max++;
					}
					break;
				}
			}
		}
		System.out.println(max);
	}
}
