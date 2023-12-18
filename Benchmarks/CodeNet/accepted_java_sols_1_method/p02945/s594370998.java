import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int a = ipt.nextInt(), b = ipt.nextInt(), add, sub, mul;
		add = a + b;
		sub = a - b;
		mul = a * b;
		if (add >= sub)
			if (mul >= add)
				System.out.println(mul);
			else
				System.out.println(add);
		if (sub > add)
			if (mul >= sub)
				System.out.println(mul);
			else
				System.out.println(sub);
	}
}