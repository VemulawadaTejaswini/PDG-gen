import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean ok = true;
		
		int xxx[] = new int[3];
		
		for (int i=0; i<3; i++) {
			xxx[i] = -1;
		}
		
		for (int i=0; i<M; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			
			if (xxx[s] == -1) {
				xxx[s] = c;
			} else if (xxx[s] != c) {
				ok = false;
			}
		}
		
		if (xxx[0] == 0 && N > 1) {
			ok = false;
		} else if (xxx[0] == -1 && N > 1) {
			xxx[0] = 1;
		}
		
		if (ok) {
			for (int i=0; i<N; i++) {
				if (xxx[i] == -1) {
					xxx[i] = 0;
				} 
				System.out.print(xxx[i]);
			}
		} else {
			System.out.print(-1);
		}
	}
}