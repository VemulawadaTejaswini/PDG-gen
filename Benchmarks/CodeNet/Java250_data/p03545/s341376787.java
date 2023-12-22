import java.util.Scanner;


public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = Character.getNumericValue(s.charAt(0));
		Main main = new Main();
		main.DC_op(s,1,start,s.substring(0, 1));
		sb.append("=7");
		System.out.println(sb.toString());

	}

	public void DC_op(String s,int steps,int results,String form) {
		if (steps == s.length()) {
			if (results == 7) {
				sb.delete(0, sb.length());
				sb.append(form);
			}
		}else {
			int target = Character.getNumericValue(s.charAt(steps));
			//+
			DC_op(s, steps + 1, results + target, form = form + "+" + target);
			form = form.substring(0, form.length() - 2);
			//-
			DC_op(s, steps + 1, results - target, form = form + "-" + target);
			form = form.substring(0, form.length() - 2);
		}

		return;
	}
}
