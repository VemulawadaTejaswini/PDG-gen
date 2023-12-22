import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int r = 0;
			int p = 0;
			int o = 0;
			for(;;) {
				String s = sc.next();
				if(s.equals("HIT")) {
					r++;
					if(r >= 4) {
						p += r - 3;
						r = 3;
					}
				}
				else if(s.equals("HOMERUN")) {
					p += 1 + r;
					r = 0;
				}
				else if(s.equals("OUT")) {
					o++;
				}
				if(o == 3) break;
			}
			System.out.println(p);
		}
	}
}