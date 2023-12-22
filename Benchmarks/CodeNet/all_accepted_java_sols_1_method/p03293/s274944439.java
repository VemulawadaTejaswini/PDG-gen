import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String ans = "No";
		for(int i = 0; i < str1.length(); i++) {
			if(str1.equals(str2)) {
				ans = "Yes";
				break;
			} else {
				char c[] = new char[str1.length()];
				char temp = ' ';
				for(int j = 0; j < str1.length(); j++) {
					if(j == 0) {
						temp = str1.charAt(j);
					}else {
						c[j - 1] = str1.charAt(j);
					}
				}
				c[str1.length() - 1] = temp;
				
				str1 = String.valueOf(c);
			}
		}
		System.out.println(ans);
	}
}