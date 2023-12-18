import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			binary( sc.nextInt() );
		}
	}

	private static void binary(int nextInt) {
		StringBuilder sb = new StringBuilder();
		int n = nextInt;
		String bin_n =  Integer.toBinaryString(n);

				if (bin_n.length() <= 10) {
					for (int i = 0; i < 10 - bin_n.length(); i++) {
						sb.append("0");
					}
				}

		bin_n = sb.append(bin_n).toString();
		sb.delete(0, sb.length());

				for (int i = 0; i < bin_n.length(); i++) {

						if ( bin_n.charAt(9 - i) == '1' ) {
							sb.append( (int)Math.pow(2, i) ).append(" ");
						}

				}

				sb.delete(sb.length() - 1, sb.length());

		String result = sb.toString();
		System.out.println(result);
	}

}
