import java.util.*;
public class Main {
	public static void main(String[] args){
		int MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		boolean f = s.equals("a") || s.equals("i") || s.equals("u") || s.equals("e") || s.equals("o");

		System.out.println(f ? "vowel" : "consonant");
	}
}