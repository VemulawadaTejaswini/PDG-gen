import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		int ans = 1;
		while(true) {
			X *= 2;
			if(Y >= X)
				ans += 1;
			else
				break;
		}
		System.out.println(ans);
	}

}
