import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String odd = sc.next();
		String even = sc.next();
		sc.close();

		int maxLength = Math.max(odd.length(), even.length());

		StringBuffer password = new StringBuffer();
		for(int i = 0; i < maxLength; i++) {
			if(odd.length() != even.length() && i == maxLength - 1) {
				password.append(odd.charAt(i));
			}else {
				password.append(odd.charAt(i));
				password.append(even.charAt(i));
			}
		}
		System.out.println(password.toString());
	}

}