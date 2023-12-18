import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		ans += Math.max(n, m);
		if(m < n) {
			ans += Math.max(m, n-1);
		}else {
			ans += Math.max(m-1, n);
		}
		System.out.println(ans);
		sc.close();
	}
	
}

