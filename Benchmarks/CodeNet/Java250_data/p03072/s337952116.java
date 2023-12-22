import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] array = new int [n];
			int res = 0;
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			int max = array[0];
			for(int numb:array) {
				if(numb>=max) {
					res++;
					max = numb;
				}
			}
			System.out.println(res);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
