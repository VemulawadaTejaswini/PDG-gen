import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			int M = stdIn.nextInt();
			if(N == 0 && M == 0) break;
			int r = stdIn.nextInt();
			int[] a = new int[M];
			boolean[][] time = new boolean[M][2001];
			int last = -1;
			boolean lastisOff = true;
			for(int i = 0; i < r; i++) {
				int t = stdIn.nextInt();
				int n = stdIn.nextInt();
				int m = stdIn.nextInt();
				int s = stdIn.nextInt();
				
				if(s == 1) {
					if(a[m-1] == 0) {
						time[m-1][t] = true;
						
					}
					if(last == t && lastisOff) {
						time[m-1][t] = false;
					}
					lastisOff= false;
					a[m-1]++;
				}
				if(s == 0) {
					if(a[m-1] == 1) {
						time[m-1][t] = true;

					}
					if(last == t && !lastisOff)  {
						time[m-1][t] = false;
					}
					lastisOff = true;
					a[m-1]--;
				}
				last = t;
			}
			int q = stdIn.nextInt();
			for(int i = 0; i < q; i++) {
				int ts = stdIn.nextInt();
				int te = stdIn.nextInt();
				int m = stdIn.nextInt();
				int count = 0;
				boolean nowUse = false;
				
				for(int j = 0; j < 2001; j++) {
					if(nowUse && time[m-1][j]) {
						nowUse = false;
					}
					else if(!nowUse && time[m-1][j]) {
						nowUse = true;
					}
					if(nowUse && j >= ts && j < te) {
						count++;
					}
					
					if(j >= te) break;
					
				}
				System.out.println(count);
				
			}
		}
	}
}