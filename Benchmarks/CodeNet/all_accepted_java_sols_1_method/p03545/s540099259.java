import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int d = Integer.parseInt(s[3]);
		int op1 = 0, op2 = 0, op3 = 0;
		boolean comp = false;
		for (op1 = 0; op1 <= 1; op1++) {
			for (op2 = 0; op2 <= 1; op2++) {
				for (op3 = 0; op3 <= 1; op3++) {
					int ans = a + ((op1 == 0)? b : -b) + ((op2 == 0)? c : -c) + ((op3 == 0)? d : -d);
					if (ans == 7) {
						comp = true;
						break;
					}
				}
				if (comp)
					break;
			}
			if (comp)
				break;
		}
		System.out.println(a + ((op1 == 0)? "+" : "-") + b + ((op2 == 0)? "+" : "-") + c + ((op3 == 0)? "+" : "-") + d + "=7");
	}
}