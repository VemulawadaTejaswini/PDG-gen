import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() % 10;
		String ans;
		if (n == 3) {
		    ans = "bon";
		} else if (n == 0 || n == 1 || n == 6 || n == 8) {
		    ans = "pon";
		} else {
		    ans = "hon";
		}
		System.out.println(ans);
	}
}
 