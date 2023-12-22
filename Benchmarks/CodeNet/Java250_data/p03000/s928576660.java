import java.util.Scanner;
public class Main {
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = sc.nextInt();
			int sum = 0;
			int res = 0;
			int[] array = new int [n];
			for(int i = 0;i<n;i++) {
				int l = sc.nextInt();
				sum+=l;
				if(sum<=x) {
					res++;
				}
			}
			System.out.println(res+1);
			sc.close();
		}
		public static void main(String[] args) {
			solve();

	}

}
