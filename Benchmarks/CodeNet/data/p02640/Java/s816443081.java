import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		String ans ="No";
		for(int i = 0; i <= x; i++) {
			int one = i * 4;
			int two = (x - i) * 2;
			if((one + two) == y) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}