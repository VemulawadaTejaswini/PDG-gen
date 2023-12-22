import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int work[] = new int[m];
		int ans = 0;
		for(int i = 0; i < m; ++i){
			work[i] = sc.nextInt();
			ans += work[i];
		}
		ans = n - ans;
		if(ans < 0)ans = -1;
		sc.close();
		System.out.println(ans);
	}
}
