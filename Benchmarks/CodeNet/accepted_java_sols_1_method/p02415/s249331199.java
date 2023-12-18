import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String text,b;
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		text=sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if(Character.isLowerCase(text.charAt(i))) {
				sb.append(Character.toUpperCase(text.charAt(i)));
			} else if (Character.isUpperCase(text.charAt(i))) {
				sb.append(Character.toLowerCase(text.charAt(i)));
			} else {
				sb.append(text.charAt(i));
			}
		}
		System.out.println(sb);
	}
}

