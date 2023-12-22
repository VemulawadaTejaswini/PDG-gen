import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ca = sc.next().toCharArray();
		String ans = "";

		for (char c : ca) {
			if (c == '0'){
				ans = ans + "0";
			}else if (c == '1'){
				ans = ans + "1";
			}else if (c == 'B'){
				ans = ans.substring(0, Math.max(ans.length()-1, 0));
			}
		}
		System.out.println(ans);
	}
}
