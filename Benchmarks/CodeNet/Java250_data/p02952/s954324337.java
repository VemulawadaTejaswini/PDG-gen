import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int res = 0;
			sc.close();
			for(int i = 1;i<=n;i++) {
				String s =String.valueOf(i);
				if(s.length()%2!=0){
					res++;
				}
			}
			System.out.println(res);
		}
	public static void main(String[] args) {
		solve();

	}

}
