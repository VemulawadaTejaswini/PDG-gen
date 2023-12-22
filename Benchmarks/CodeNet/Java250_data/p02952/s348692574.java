import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int len = String.valueOf(n).length();
		int c = 0;

		for(int i = 1; i <= len; i += 2) {
			if(i < len) {
				c += (int)Math.pow(10, i - 1) * 9;
			} else {
				if(i == 1) c += n;
				else c += n - (int)Math.pow(10, i - 1) + 1;
			}
		}
		System.out.println(c);
	}
}