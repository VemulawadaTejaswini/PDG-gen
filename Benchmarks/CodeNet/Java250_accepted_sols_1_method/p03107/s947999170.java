import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		sc.close();
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			if(s.charAt(i) == '0')++ans;
		}
		if(n - ans < ans)ans = n - ans;
		ans *= 2;
		System.out.println(ans);
	}

}

