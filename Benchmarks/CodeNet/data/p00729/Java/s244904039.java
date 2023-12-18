import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				ArrayList<int[]> list = new ArrayList<int[]>();
				
				int N = sc.nextInt();
				int M = sc.nextInt();
				if(N + M == 0) break;
				boolean[][] log = new boolean[M+1][1261];
				
				int r = sc.nextInt();
				while(r-- != 0) {
					int t = sc.nextInt();
					int n = sc.nextInt();
					int m = sc.nextInt();
					int s = sc.nextInt();
					if(s == 1) {
						list.add(new int[] {n, m, t});
					}
					else {
						int st = -1;
						for(int i=0; i<list.size(); i++) {
							int[] h = list.get(i);
							if(h[0] == n && h[1] == m) {
								st = h[2];
								list.remove(i);
								break;
							}
						}
						for(int i=st; i<t; i++) {
							log[m][i] = true;
						}
					}
				}
				
				int q = sc.nextInt();
				while(q-- != 0) {
					int sec = 0;
					int ts = sc.nextInt();
					int te = sc.nextInt();
					int m = sc.nextInt();
					for(int i=ts; i<te; i++) {
						if(log[m][i]) sec++;
						System.out.println(sec);
					}
				}
			}
		}
	}
}
