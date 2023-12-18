import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char[] c = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<c.length; i++) {
			if (c[i] == '0' | c[i] == '1') {
				sb.append(c[i]);
			} else if (c[i] == 'B') {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
