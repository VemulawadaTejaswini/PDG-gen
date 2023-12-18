/**
 * @author yuichirw
 *
 */
import java.util.*;
import java.util.Map.Entry;

public class Main {
	static int n;
	static String line;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		line = sc.next();
		return true;
	}
	
	static String solve() {
		int l;
		l = (line.length() - 1) / 3;
		String alw, a, b;
		HashMap<String, Train> trains = new HashMap<String, Train>();
		
		for(int i = 0; i < l; i++) {
			alw = line.substring(i * 3 + 1, i * 3 + 1 + 2);
			a = line.substring(i*3, i*3+1); b = line.substring(i*3+3, i*3+3+1);
			Train ta, tb;
			if(!trains.containsKey(a)) {
				ta = new Train(a);
			} else {
				ta = trains.get(a);
			}
			if(!trains.containsKey(b)) { 
				tb = new Train(b);
			} else {
				tb = trains.get(b);
			}
			
			//System.out.println(a + " " + b);
			if(alw.equals("->")) {
				ta.joinNext(tb); tb.joinBefore(ta);
			} else {
				tb.joinNext(ta); ta.joinBefore(tb);
			}
			trains.put(a, ta); trains.put(b, tb);
		}
		
		Train t = null;
		for(Entry<String, Train> e : trains.entrySet()) {
			t = e.getValue();
			if(t.before == null) {
				break;
			}
		}
		String ans = "";
		while(t != null) {
			ans += t.name;
			t = t.next;
		}

		return ans;
	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		while(n-- > 0 && read()) {
			System.out.println(solve());
		}
	}
}

class Train {
	String name;
	Train before, next;
		
	Train(String name) {
		this.name = name;
	}
	
	void joinBefore(Train t) {
		this.before = t;
	}
	
	void joinNext(Train t) { 
		this.next = t;
	}	
	
	public String toString() {
		return this.name;
	}
}