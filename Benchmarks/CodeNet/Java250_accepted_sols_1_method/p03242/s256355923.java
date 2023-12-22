import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '9') { c = '1'; }
			else { c = '9'; }
			ans += String.valueOf(c);
		}
		System.out.println(ans);
	}
}
