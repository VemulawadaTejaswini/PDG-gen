import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			if(Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
				sb.append(c);
			}else if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
				sb.append(c);
			}else if(!(Character.isAlphabetic(c))){
				sb.append(c);
			}else if(Character.isWhitespace(c)) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
