import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_2_D();
	}
        public static void ALDS1_2_D() {

		//Shell Sort Class
		class shellSort{
			int n;
			int m = 20;
			int[] a;
			int[] g = new int[m];
			int cnt = 0;
			
			void initA() {
				a = new int[n];
			}

			void shell(int[] a, int n) {
				cnt = 0;
				for(int i = 1; i <= m; i++) {
					g[m - i] = 3 * (m - i) + 1;
					insertion(a, n, g[m - i]);
				}
			}

			void shell() {
				cnt = 0;
				for(int i = 1; i <= m; i++) {
					g[m - i] = 3 * (m - i) + 1;
					insertion(a, n, g[m - i]);
				}
			}
			
			void insertion(int[] a, int n, int g) {
				for(int i = g; i < n; i++) {
					int temp = a[i];
					int j = i - g;
					while(j >= 0 && temp < a[j]) {
						a[j + g] = a[j];
						j = j - g;
						cnt++;
					}
					a[j + g] = temp;
				}
			}
			
			void printOutPut() {
				System.out.println(m);
				for(int i = 0; i < m; i++) {
					if(i != 0)
						System.out.print(" ");
					System.out.print(g[i]);
				}
				System.out.println();
				System.out.println(cnt);
				for(int i = 0; i < n; i++) {
					System.out.println(a[i]);
				}

			}
		}

		shellSort sh = new shellSort();
		Scanner sc = new Scanner(System.in);
		sh.n = sc.nextInt();
		sh.initA();
		for(int i = 0; i < sh.n; i++) {
			sh.a[i] = sc.nextInt();
		}

		sh.shell();
		sh.printOutPut();
	}
}
