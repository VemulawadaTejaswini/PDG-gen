import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(Character.isLowerCase(c)){
				sb.append(Character.toUpperCase(c));
			} else if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}