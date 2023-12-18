import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	static Map<String, Integer> opPriority = new HashMap<String, Integer>(){
		{
			put("+", 2);
			put("-", 2);
			put("*", 3);
			put("/", 3);
		}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			List<String> list = make(s);
			Deque<Integer> stackNum = new ArrayDeque<Integer>();
			Deque<String> stackOp = new ArrayDeque<String>();
			for(String t : list) {
				if(t.equals("=")) break;
				if(t.matches("\\d+")) {
					stackNum.addFirst(Integer.parseInt(t));
				}else if(opPriority.containsKey(t)){
					while(stackOp.size() > 0) {
						String op = stackOp.removeFirst();
						if(opPriority.containsKey(op)) {
							if(opPriority.get(t) <= opPriority.get(op)) {
								int v2 = stackNum.removeFirst();
								int v1 = stackNum.removeFirst();
								stackNum.addFirst(calc(op, v1, v2));
							}else {
								stackOp.addFirst(op);
								break;
							}
						}else {
							stackOp.addFirst(op);
							break;
						}
					}
					stackOp.addFirst(t);
				}else if(t.equals("(")){
					stackOp.addFirst(t);
				}else if(t.equals(")")){
					while(stackOp.size() > 0){
						String op = stackOp.removeFirst();
						if(op.equals("(")) {
							break;
						}else {
							int v2 = stackNum.removeFirst();
							int v1 = stackNum.removeFirst();
							stackNum.addFirst(calc(op, v1, v2));
						}
					}
				}
			}
			while(stackOp.size() > 0) {
				String op = stackOp.removeFirst();
				if(opPriority.containsKey(op)) {
					int v2 = stackNum.removeFirst();
					int v1 = stackNum.removeFirst();
					stackNum.addFirst(calc(op, v1, v2));
				}
			}
			System.out.println(stackNum.removeFirst());
		}
		sc.close();
	}
	static int calc(String op, int v1, int v2) {
		if(op.equals("+")) {
			return v1 + v2;
		}else if(op.equals("-")) {
			return v1 - v2;
		}else if(op.equals("*")) {
			return v1 * v2;
		}else if(op.equals("/")){
			return v1 / v2;
		}else {
			return 0;
		}
	}
 	static List<String> make(String s){
		List<String> list = new ArrayList<String>();
		int l = s.length();
		int idx = 0;
		while(idx < l) {
			char c = s.charAt(idx);
			if(c == '=') {
				list.add("=");
				break;
			}
			if(c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') {
				list.add(String.valueOf(c));
				idx++;
			}else {
				int begin = idx;
				char t = s.charAt(idx);
				while(t >= '0' && t <= '9') {
					idx++;
					t = s.charAt(idx);
				}
				list.add(s.substring(begin, idx));
			}
		}
		return list;
	}
}
