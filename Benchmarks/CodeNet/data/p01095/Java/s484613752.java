import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		new Bamboo_Blossoms().main();
	}

	class Bamboo_Blossoms{
		final int MAX = Integer.MAX_VALUE;
		final int LEN = 7368792;
		void main() {
			while(true) {
				int m = sc.nextInt();
				int n = sc.nextInt();
				if(m == 0 && n == 0) return;
				boolean b[] = new boolean[LEN];
				Arrays.fill(b, true);
				for(int i = 0; i < m; i++)
					b[i] = false;
				int j = m;
				for(int i = 0; i < n; i++) {
					if(j == LEN) break;
					while(!b[j]) {
						j++;
						if(j == LEN) break;
					}
					
					for(int k = j ;k < LEN; k += j) {
						b[k] = false;
					}
				}
				for(int i = 0; i < LEN; i++) {
					if(b[i]) {
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
