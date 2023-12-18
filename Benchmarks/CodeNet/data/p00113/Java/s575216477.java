import java.util.*;
public class Main {

	public static void main(String[] args) {
		int p, q, r, quot;
		int c_st, c_ed;
		int count;
		boolean flag;
		Scanner scanner = new Scanner(System.in);
		StringBuffer decimalString = new StringBuffer();
		ArrayList<Integer> remainList = new ArrayList<Integer>();
		
		while (scanner.hasNext()) {
			p = scanner.nextInt();
			q = scanner.nextInt();
			
			decimalString.setLength(0);
			remainList.clear();
			flag = true;
			c_st = c_ed = 0;
			count = 0;
			r = p;
			
			remainList.add(p);
			
			while (flag && r > 0) {
				count++;
				p *= 10;
				quot = p / q;
				r = p % q;
				p = r;
				decimalString.append(quot);
				
				if (quot != 0 && remainList.contains(r)) {
					c_st = remainList.indexOf(r);
					c_ed = count;
					flag = false;
				} else {
					remainList.add(r);
				}
			}
			
			if (flag) {
				System.out.println(decimalString.toString());
			} else {
				System.out.println(decimalString.toString());
				StringBuffer str = new StringBuffer();
				for(int i = 0; i < c_st; i++) {
					str.append(" ");
				}
				for(int i = c_st; i < c_ed; i++) {
					str.append("^");
				}
				System.out.println(str.toString());
			}
		}
	}
}