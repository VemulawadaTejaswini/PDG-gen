import java.util.Scanner;

public class Main {
	static String str;
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(reverse(str));
	}
	
	private static String reverse(String str) {
		char[] strArray = new char [str.length()];
		for(int i = 0; i < str.length(); i++)
			strArray[i] = str.charAt(i);
		String reverse = String.valueOf(strArray);
		return reverse;
	}
	
}