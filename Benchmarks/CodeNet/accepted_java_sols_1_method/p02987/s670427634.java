import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Arrays.sort(s);
		System.out.println((s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) ? "Yes" : "No");	
	}
}