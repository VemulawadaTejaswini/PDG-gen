import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		System.out.println(s[2]==s[3]&&s[4]==s[5] ? "Yes" : "No");
		
		sc.close();
	}
}
