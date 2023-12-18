import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
	private	static	BufferedReader	br = null;
	private	static	TermTbl			tt = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		tt = new TermTbl();
		tt.put('+', 1);
		tt.put('-', 1);
		tt.put('*', 2);
		tt.put('/', 2);
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num = parseNum();

		while (num-- > 0) {
			Formula	formula = parseFormula();
			System.out.println(calc(formula));
		}
	}

	private static int calc(Formula formula) {
		Formula	stk = new Formula();
		String	obj = null;
		String	trm = null;
		int		size = formula.size();

		// 数式を逆ポーランド記法に変換
		for (int l = 0; l < size; l++) {
			obj = formula.get(l);

			if (obj.equals("+") || obj.equals("-") || obj.equals("*") || obj.equals("/")) {
					trm = obj;
			}
			else if (obj.equals("(")) {
				Formula	ins = new Formula();
				int		per = 1;
				for(int i = l; i < size && per > 0;) {
					formula.remove(i);
					size--;
					String	tmp = formula.get(i);

					if (tmp.equals(")") && per == 1) {
						ins.push("=");
						formula.remove(i);
						formula.insertElementAt(String.valueOf(calc(ins)), l--);
						per = 0;
					}
					else {
						if (tmp.equals("(")) {
							per++;
						}
						else if (tmp.equals(")")) {
							per--;
						}
						ins.push(tmp);
					}
				}
			}
			else if (!obj.equals("=")) {
				if (trm == null) {
					stk.push(obj);
				} else {
					for (int i = stk.size() - 1; i >= 0; i--) {
						String	tmp = stk.get(i);
						if (tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/")) {
							if (tt.get(trm.charAt(0)) <= tt.get(tmp.charAt(0))) {
								stk.insertElementAt(obj, i+1);
								stk.insertElementAt(trm, i+2);
								trm = null;
								break;
							}
						} else {
							stk.insertElementAt(obj, i+1);
							stk.insertElementAt(trm, i+2);
							trm = null;
							break;
						}
					}
				}
			}
		}

		// 数式を計算
		size = stk.size();
		for (int l = 0; l < size; l++) {
			String	tmp = stk.get(l);
			int		a   = 0;
			int		b   = 0;
			int		c   = 0;
			if (tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/")) {
				a = Integer.parseInt(stk.get(l-2));
				stk.remove(l-2);
				b = Integer.parseInt(stk.get(l-2));
				stk.remove(l-2);

				if (tmp.equals("+")) {
					c = a + b;
				}
				else if (tmp.equals("-")) {
					c = a - b;
				}
				else if (tmp.equals("*")) {
					c = a * b;
				}
				else if (tmp.equals("/")) {
					c = a / b;
				}

				stk.remove(l-2);
				stk.insertElementAt(String.valueOf(c), l-2);
				l    -= 3;
				size -= 2;
			}
		}

		return Integer.parseInt(stk.get(0));
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static Formula parseFormula() {
		Formula	formula = null;
		String	str     = null;

		if ((str = parseStdin()) != null) {
			int		size = str.length();
			Integer	num  = 0;

			formula = new Formula();
			for	(int l = 0; l < size; l++) {
				Character	chr = str.charAt(l);
				if (Character.isDigit(chr)) {
					if (l > 0) {
						if (Character.isDigit(str.charAt(l-1))) {
							num *= 10;
						}
					}
					num += (int)(chr - '0');
				} else {
					if (l > 0) {
						if (Character.isDigit(str.charAt(l-1))) {
							formula.push(String.valueOf(num));
						}
					}
					formula.push(String.valueOf(chr));
					num = 0;
				}
			}
		}

		return formula;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class TermTbl extends HashMap<Character, Integer> {
}

class Formula extends Stack<String> {
}