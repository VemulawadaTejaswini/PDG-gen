import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = Long.parseLong(sc.next());
		
		String ans = "";
		int cnt = 0;
		for(int i = 0; i < S.length(); i++) {
			if(!S.substring(i, i + 1).equals("1")) {
				ans = S.substring(i, i + 1);
				break;
			} else {
				cnt++;
				if(cnt == K) {
					ans = "1";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
