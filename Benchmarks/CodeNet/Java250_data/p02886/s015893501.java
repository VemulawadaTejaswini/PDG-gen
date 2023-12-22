import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum = 0;
			int array[] = new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			for(int i = 0;i<n-1;i++) {
				for(int l =i+1;l<n;l++) {
					sum+= array[l]*array[i];
				}
			}
			System.out.println(sum);
			sc.close();
		}
	
	public static void main(String[] args) {
		solve();

	}

}
