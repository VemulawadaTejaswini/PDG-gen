import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int n;
	static Scanner sc = new Scanner(System.in);
	static Queue<String> events;
	
	static boolean read() {
		int cnt = 0;
		String event;
		events = new LinkedList<String>();
		do {
			event = sc.next();
			if(event.equals("OUT")) {
				cnt++;
			} else {
				events.offer(event);
			}
		} while(cnt < 3);
		
		return true;
	}
	
	static int solve() {
		int ans = 0, s = 0;
		while(!events.isEmpty()) {
			String e = events.poll();
			s = (s << 1) + 1;
			if(e.equals("HIT")) {
				//Single hit
				if((s & 8) > 1) {
					ans++;
				}
				s = (s & 7);
			} else {
				//homerun
				for(int i = 1; i < 16; i = (i << 1)) {
					if((s & i) >= 1) {
						ans++;
					}
				}
				s = 0;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		while(n -- > 0 && read()) {
			System.out.println(solve());
		}
	}
}