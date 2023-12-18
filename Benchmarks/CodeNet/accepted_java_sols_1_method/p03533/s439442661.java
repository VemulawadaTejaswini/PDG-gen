import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = '0';
		for(char c : s.toCharArray()) {
			if(ch=='A' && c=='A') {
				System.out.println("NO");
				return;
			} else {
				ch = c;
			}
		}
		if(s.startsWith("A") || s.startsWith("KIH")) {

		} else {
			System.out.println("NO");
			return;
		}
		s = s.replaceAll("A", "");
		String str = "KIHBR";
		if(s.equals(str)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
