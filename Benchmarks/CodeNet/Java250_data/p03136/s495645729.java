import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum = 0;
			String res = "No";
			int[] array = new int [n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				sum+=array[i];
			}
			int max = array[0];
			for(int numb:array) {
				if(numb>=max) 
					max = numb;
				}
			if(max<sum-max) {
				res = "Yes";
			}
		
			System.out.println(res);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}