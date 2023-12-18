import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int dif = n - m;
		long ans = 0;
		if(dif < 0) {
			dif= dif*-1;
		}
		if(dif > 1) {
			System.out.println(ans);
		}else{
			if(dif == 0) {
				ans = 2;
			}else {
				ans = 1;
			}
			for(int i = 2; i < n+1; i++) {
				ans = ans * i % 1000000007;
			}
			for(int i = 2; i < m+1; i++) {
				ans = ans * i % 1000000007;
			}
			System.out.println(ans);
		}
	}

}