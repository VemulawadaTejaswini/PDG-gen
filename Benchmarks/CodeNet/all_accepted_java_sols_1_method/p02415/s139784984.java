import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.nextLine();
		String ans = "";
		for (int i=0; i<s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				ans += Character.toLowerCase(s.charAt(i));
			}else if (Character.isLowerCase(s.charAt(i))) {
				ans += Character.toUpperCase(s.charAt(i));
			}else{
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}