import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String W = sc.nextLine();
		String T = "";
		String end = "END_OF_TEXT";
		int ans = 0;

		while (!(T.equals(end))) {
			T = sc.next();
			if(W.equals(T)){
				ans++;
			}
		}

		System.out.println(ans);
	}

}