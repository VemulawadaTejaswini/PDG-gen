import java.util.*;

public class Main {
	public static void main(String[] args) {
		char[] s = new Scanner(System.in).next().toCharArray();
		Arrays.sort(s);
		System.out.println(s[0] == s[1] && s[2] == s[3] && s[1] != s[2] ? "Yes" : "No");
	}
}
