import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < a ; i++) sb.append(".");
		sb.append("-");
		for(int i = 0 ; i < b ; i++) sb.append(".");
		if(s.substring(0, a).matches(sb.toString().substring(0, a)) && s.substring(a, a + 1).equals(sb.toString().substring(a, a + 1)) && s.substring(a + 1).matches(sb.toString().substring(a + 1)) && !s.substring(0, a).contains("-") && !s.substring(a + 1).contains("-")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
