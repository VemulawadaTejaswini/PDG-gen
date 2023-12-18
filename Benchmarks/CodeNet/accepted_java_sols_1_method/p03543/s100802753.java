
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] n = sc.next().toCharArray();
		String ans = "No";

		if (n[0] == n[1] && n[1] == n[2])
			ans = "Yes";
		if (n[1] == n[2] && n[2] == n[3])
			ans = "Yes";

		System.out.println(ans);
	}

}
