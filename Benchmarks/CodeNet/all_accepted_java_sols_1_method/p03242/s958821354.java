import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String n = "";
		for (int i = 0; i < N.length(); i++) {
			if (String.valueOf(N.charAt(i)).equals("9")) {
				n+="1";
			}else  {
				n+="9";
			}
		}
		System.out.println(n);
		sc.close();
	}
}