import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String ans = "";
		for(int i = 0; i < 3; i++) {
			String str = n.substring(i,i+1);
			if("1".equals(str)) {
				ans += "9";
			} else {
				ans += "1";
			}
		}
		System.out.println(ans);
	}
}
