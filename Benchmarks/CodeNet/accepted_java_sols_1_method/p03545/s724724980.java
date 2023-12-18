import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			char[] c = s.toCharArray();

			for(int i = 0 ; i < 1 << c.length ; i++) {
				StringBuilder sb = new StringBuilder();
				int result = Integer.parseInt(String.valueOf(c[0]));
				sb.append(c[0]);
				for(int j = 1 ; j < c.length ; j++) {
					if((1 & i >> j) == 1) {
						sb.append("+");
						result += Integer.parseInt(String.valueOf(c[j]));
					} else {
						sb.append("-");
						result -= Integer.parseInt(String.valueOf(c[j]));
					}
					sb.append(c[j]);
				}
				if(result == 7) {
					sb.append("=7");
					System.out.println(sb.toString());
					return;
				}
			}

			System.out.println("No");
		}

	}

}
