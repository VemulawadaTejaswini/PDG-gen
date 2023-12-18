import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	static List<int[]> list;
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
		list = new ArrayList<int[]>();
		int n = 4;
		int []a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i;
        }
        perm(0, a, new boolean [n + 1]);
		while(sc.hasNext()) {
			int[] x = new int[4];
			for(int i = 0; i < 4; i++) {
				x[i] = sc.nextInt();
			}
			if(x[0] == 0) break;
			boolean flag = true;
			loop: for(int i = 0; i < list.size(); i++) {
				int[] b = list.get(i);
				String[] equ = equ(b, x);
				for(String s : equ) {
					if(eval(s) == 10) {
						System.out.println(s.substring(0, s.length() - 1));
						flag = false;
						break loop;
					}
				}
			}
			if(flag) System.out.println(0);
		}
		sc.close();
	}
	static int eval(String s) {
		//System.out.println(s);
		List<String> list = new ArrayList<String>();
		list = make(s);
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
		return stackNum.removeFirst();
	}
	static String[] equ(int[] a, int[] x) {
		int n = 27 * 3;
		String[] ret = new String[n];
		String[] b = new String[4];
		for(int i = 0; i < 4; i++) {
			b[i] = Integer.toString(x[a[i]]);
		}
		int idx = 0;
		String[] op = {"+", "-", "*"};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					String t1 = "(" + b[0] + op[i] + b[1] + ")" + op[j] + "(" + b[2] + op[k] + b[3] + ")=";
					ret[idx] = t1;
					idx++;
					String t2 = "(" + b[0] + op[i] + b[1] + op[j] + b[2] + ")" + op[k] + b[3] + "=";
					ret[idx] = t2;
					idx++;
					String t3 = b[0] + op[i] + "(" + b[1] + op[j] + b[2] + ")" + op[k] + b[3] + "=";
					ret[idx] = t3;
					idx++;
				}
			}
		}
		return ret;
	}
	static void perm(int n, int[] a, boolean[] flag) {
        if(n == a.length) {
        	int[] b = new int[a.length];
        	System.arraycopy(a, 0, b, 0, a.length);
        	list.add(b);
            return;
        }
        for(int i = 1; i <= a.length; i++) {
            if(flag[i]) continue;
            a[n] = i - 1;
            flag[i] = true;
            perm(n + 1, a, flag);
            flag[i] = false;
        }
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
