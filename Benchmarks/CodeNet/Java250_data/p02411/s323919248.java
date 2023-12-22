public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {

			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();

			if ( m==-1 && f==-1 && r==-1 ) break;

			if ( m==-1 || f==-1 ) sb.append("F\n");
			else if ( m+f >= 80 ) sb.append("A\n");
			else if ( m+f >= 65 ) sb.append("B\n");
			else if ( m+f >= 50 ) sb.append("C\n");
			else if ( m+f >= 30 ) {
				if ( r>=50 ) sb.append("C\n");
				else sb.append("D\n");
			} else sb.append("F\n");

		}

		System.out.print(sb);
	}

}