import java.util.Scanner;

public class Main{

	public static String code = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String word1;
		String word2;

		word1 = sc.next();

		for (int i = 1; i < n; i++){
			word2 = sc.next();

			if (!first(word1, word2)){
				word1 = word2;
			}
		}
		System.out.println("" + word1);
	}

	public static int toCode(char c){
		for (int i = 0; i < code.length(); i++){
			if (c == code.charAt(i)){
				return i;
			}
		}
		return -1;
	}

	public static boolean first(String a, String b){
		int code_a = toCode(a.charAt(0));
		int code_b = toCode(b.charAt(0));

		if (code_a < code_b){
			return true;
		}else if (code_a > code_b){
			return false;
		}

		if (a.length() <= 1 && b.length() <= 1){
			return true;
		}else if (a.length() <= 1){
			return true;
		}else if (b.length() <= 1){
			return false;
		}

		return first(a.substring(1), b.substring(1));
	}
}