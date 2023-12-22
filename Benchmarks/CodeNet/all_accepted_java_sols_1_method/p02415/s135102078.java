import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String st = scan.nextLine();
		sb.append(st);

		int l = st.length();
		for (int i = 0; i < l; i++) {
			char cha = sb.charAt(i);
			if ( Character.isUpperCase(cha) ) {
				char lchar = Character.toLowerCase(cha);
				sb.setCharAt(i, lchar);
			}else if ( Character.isLowerCase(cha) ) {
				char uchar = Character.toUpperCase(cha);
				sb.setCharAt(i, uchar);
			}
		}
		System.out.println(sb);
	}
}