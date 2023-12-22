public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String[] data = sc.nextLine().split(" ");

			int a = Integer.parseInt(data[0]);
			String op = data[1];
			int b = Integer.parseInt(data[2]);

			if ( op.equals("?") ) break;

			switch (op) {
			case "+":
				sb.append( (a+b) + "\n" );
				break;
			case "-":
				sb.append( (a-b) + "\n" );
				break;
			case "*":
				sb.append( (a*b) + "\n" );
				break;
			case "/":
				sb.append( (a/b) + "\n" );
				break;
			}
		}

		System.out.print(sb);
	}

}