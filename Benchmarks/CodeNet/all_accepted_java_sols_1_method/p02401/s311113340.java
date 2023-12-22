public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a;// = sc.nextInt();
		String op;// = sc.next();
		int b;// = sc.nextInt();

		do {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if (op.equals("?")) {break;}
			if (op.equals("+")) {sb.append(a+b).append("\n");}
			if (op.equals("-")) {sb.append(a-b).append("\n");}
			if (op.equals("*")) {sb.append(a*b).append("\n");}
			if (op.equals("/")) {sb.append(a/b).append("\n");}
		} while(true);
		System.out.print(sb);
	}
}