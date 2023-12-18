import java.util.*;
import static java.lang.Math.*;

public class Main {

	static String worm;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		worm = sc.next();
		return (worm.equals("0")) ? false : true;
	}
	
	static String solve() {
		return bfs(worm);
	}
	
	static String bfs(String w) {
		HashSet<String> set = new HashSet<String>();
		Queue<State> que = new LinkedList<State>();
		
		que.add(new State(w, 0));
		set.add(w);
		State s;
		while(!que.isEmpty()) {
			s = que.poll();
			if(same(s.worm)) return new Integer(s.level).toString();
			for(int i = 0; i < s.worm.length() - 1; i++) {
				w = changeColor(s.worm, i);
				if(w == null) continue;
				if(!set.contains(w)) {
					set.add(w);
					que.add(new State(w, s.level + 1));
				}
			}
		}
		return "NA";
	}
	
	static boolean same(String w) {
		boolean ans = true;
		char c = w.charAt(0);
		for(int i = 1; i < w.length(); i++) {
			if(c != w.charAt(i)) {
				ans = false;
				break;
			}
		}
		return ans;
	}
	
	static String changeColor(String w, int index) {
		String c = getColor(w.substring(index, index+1), w.substring(index+1, index+1+1));
		if(c == null) return null;
		
		if(index == 0) {
			return c + c + w.substring(2);
		} else if(index == w.length() - 1) {
			return w.substring(0, w.length() - 2) + c + c; 
		} else {
			return w.substring(0, 0 + index) + c + c + w.substring(index + 2, w.length());
		}
	}
	
	static String getColor(String c1, String c2) {
		if(c1.equals("r")) {
			if(c2.equals("g")) {
				return "b";
			} else if(c2.equals("b")) {
				return "g";
			}
		} else if(c1.equals("g")) {
			if(c2.equals("r")) {
				return "b";
			} else if(c2.equals("b")) {
				return "r";
			}
		} else if(c1.equals("b")) {
			if(c2.equals("r")) {
				return "g";
			} else if(c2.equals("g")) {
				return "r";
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}

	}

}

class State {
	int level;
	String worm;
	
	State(String worm, int level) {
		this.worm = worm; this.level = level;
	}
}