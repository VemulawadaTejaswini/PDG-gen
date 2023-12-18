import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		System.out.println((s[0]==t[0] ? 1 : 0)+(s[1]==t[1] ? 1 : 0)+(s[2]==t[2] ? 1 : 0));
	}
}
