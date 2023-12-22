import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int n = sc.nextInt();
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			char[] c = s.toCharArray();
			for(int i = 0 ; i < s.length() ; i++) {
				int index = alpha.indexOf(c[i]);
				if(index + n <= 25) {
					sb.append(alpha.charAt(index + n));
				} else {
					sb.append(alpha.charAt(index + n - 26));
				}
			}

			System.out.println(sb.toString());

		}

	}

}
