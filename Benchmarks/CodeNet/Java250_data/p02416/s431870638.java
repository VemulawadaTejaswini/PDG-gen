public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {

			String data = sc.nextLine();
			if ( data.equals("0") ) break;

			int sum = 0;
			for (int i=0; i < data.length(); i++) {
				sum += Integer.parseInt( data.substring(i, i+1) );
			}

			sb.append(sum + "\n");

		}

		System.out.print(sb);
	}

}