import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		int A = Integer.parseInt(n.substring(0,1));
		int B = Integer.parseInt(n.substring(1,2));;
		int C = Integer.parseInt(n.substring(2,3));;
		int D = Integer.parseInt(n.substring(3,4));;

		boolean op1[] = {true,false};
		boolean op2[] = {true,false};
		boolean op3[] = {true,false};

		int cal1 = 0;
		int cal2 = 0;
		int ans = 0;

		boolean op[] = new boolean[3];

		calc:for (int i = 0; i < 2; i++) {
			if (op1[i]) {
				cal1 = A+B;
			} else {
				cal1 = A-B;
			}
			for (int j = 0; j < 2; j++) {
				if (op2[j]) {
					cal2 = cal1+C;
				} else {
					cal2 = cal1-C;
				}
				for (int k = 0; k < 2; k++) {
					if (op3[k]) {
						ans = cal2+D;
					} else {
						ans = cal2-D;
					}
					if (ans == 7) {
						op[0] = op1[i];
						op[1] = op2[j];
						op[2] = op3[k];
						break calc;
					}
				}
			}
		}
		String s[] = new String[3];
		for (int i = 0; i < 3; i++) {
			if (op[i]) {
				s[i] = "+";
			} else {
				s[i] = "-";
			}
		}
		System.out.println(A+s[0]+B+s[1]+C+s[2]+D+"=7");
	}
}
