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
			Stack	formula = parseFormula();
			System.out.println(calc(formula));
		}
	}

	private static int calc(Stack formula) {
		Stack	stk = new Stack();
		Object	obj = null;
		Object	trm = null;
		int		size = formula.size();
		int		res  = 0;

		// 数式を逆ポーランド記法に変換
		for (int l = 0; l < size; l++) {
			obj = formula.get(l);
			if (obj instanceof Character) {
				switch ((Character)obj) {
				case	'+':
				case	'-':
				case	'*':
				case	'/':
					trm = obj;
					break;
				case	'=':
					break;
				case	'(':
					{
						Stack	ins = new Stack();
						int		per = 1;
						for(int i = l; i < size && per > 0;) {
							formula.remove(i);
							size--;
							Object	tmp = formula.get(i);
							if (tmp instanceof Integer) {
								ins.push(tmp);
							} else {
								switch ((Character)tmp) {
								case	'(':
									per++;
									ins.push(tmp);
									break;
								case	')':
									per--;
									if (per > 0) {
										ins.push(tmp);
									} else {
										ins.push((Character)'=');
										formula.remove(i);
										formula.insertElementAt((Integer)calc(ins), l--);
									}
									break;
								default:
									ins.push(tmp);
									break;
								}
							}
						}
					}
					break;
				}
			} else if (obj instanceof Integer) {
				if (trm == null) {
					stk.push(obj);
				} else {
					for (int i = stk.size() - 1; i >= 0; i--) {
						Object	tmp = stk.get(i);
						if (tmp instanceof Character) {
							if (tt.get(trm) <= tt.get(tmp)) {
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
			Object	tmp = stk.get(l);
			Integer	a   = null;
			Integer	b   = null;
			Object	c   = 0;
			if (tmp instanceof Character) {
				a = (Integer)stk.get(l-2);
				stk.remove(l-2);
				b = (Integer)stk.get(l-2);
				stk.remove(l-2);

				switch ((Character)tmp) {
				case	'+':
					c = a + b;
					break;
				case	'-':
					c = a - b;
					break;
				case	'*':
					c = a * b;
					break;
				case	'/':
					c = a / b;
					break;
				default:
					break;
				}
				stk.remove(l-2);
				stk.insertElementAt(c, l-2);
				l    -= 3;
				size -= 2;
			}
		}

		if (stk.get(0) instanceof Integer) {
			res = (Integer)stk.get(0);
		}

		return res;
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static Stack parseFormula() {
		Stack	formula = null;
		String	str     = null;

		if ((str = parseStdin()) != null) {
			int		size = str.length();
			Integer	num  = 0;

			formula = new Stack();
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
							formula.push(num);
						}
					}
					formula.push(chr);
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