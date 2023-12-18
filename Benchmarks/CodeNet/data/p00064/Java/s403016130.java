
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		while(sc.hasNext()) {
			String str = sc.next();
			for(int i=0;i<str.length();i++) {
				if('0' <= str.charAt(i) && '9' >= str.charAt(i)) {
					String num = "";
					for(;i<str.length() && '0' <= str.charAt(i) && '9' >= str.charAt(i); i++)
						num += str.charAt(i);
					ans += Integer.parseInt(num);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}