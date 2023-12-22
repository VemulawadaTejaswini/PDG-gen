import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int ans = 0;

		for (int i = 0; i < k; i++) {
			if (!s.substring(i, i+1).equals("1")) {
				ans = Integer.valueOf(s.substring(i, i+1));
				break;
			}
		}
		
		if (ans == 0) {
			System.out.println(1);	
		} else {
			System.out.println(ans);
		}
		
		sc.close();
	}

}
