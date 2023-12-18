import java.util.*;
import static java.lang.System.*;

public class Main {

	
//	class P {
//		int a, b;
//		P(int a, int b) {
//			this.a = a;
//			this.b = b;
//		}
//		
//		public boolean equals(Object obj) {
//			if(obj instanceof P){
//				P p=(P)obj;
//				return this.a == p.a && this.b == p.b;
//			}
//			return false;
//		}
//	}
	
	Scanner sc = new Scanner(in);
	
	char[] eq;
	int len;
	
//	Map<P, Set<Integer>> memo = new HashMap<P, Set<Integer>>();
	
	Set<Integer> calc(int a, int b) {
//		P p = new P(a, b);
//		if (!memo.containsKey(p)) {
			Set<Integer> set = new HashSet<Integer>();
			if (eq[a] == '(' && eq[b] ==')')
				return calc(a+1, b-1);
			
			int count = 0;
			for (int i = a; i <= b; i++) {
				switch(eq[i]) {
				case '+':
					if (count == 0)
						for (int k : calc(a, i-1))
							for (int l : calc(i+1, b))
								set.add(k+l);
					break;
				case '-':
					if (count == 0)
						for (int k : calc(a, i-1))
							for (int l : calc(i+1, b))
								set.add(k-l);
					break;
				case '*':
					if (count == 0)
						for (int k : calc(a, i-1))
							for (int l : calc(i+1, b))
								set.add(k*l);
					break;
				case '/':
					if (count == 0)
						for (int k : calc(a, i-1))
							for (int l : calc(i+1, b))
								if (l != 0)
									set.add(k/l);
					break;
				case '(':
					count++; break;
				case ')':
					count--; break;
				}
	
			}
			
			if (set.isEmpty()) {
				int value = 0;
				for (int i = a; i <= b; i++) {
					value = 10*value + Character.getNumericValue(eq[i]);
				}
				set.add(value);
			}
			
//			memo.put(p, set);
//		}
		
//		return memo.get(p);
			return set;
	}
	
	void run() {
		String s;
		while (true) {
			s = sc.nextLine();
			if (s.equals("#")) break;
			eq = s.toCharArray();
			len = eq.length;
//			memo.clear();
			out.println(calc(0, len-1).size());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}