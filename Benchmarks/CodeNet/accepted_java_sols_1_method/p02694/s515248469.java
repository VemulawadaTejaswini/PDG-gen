import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long yen = 100;
		int ans = 0;
		while(yen < X) {
			ans++;
			yen *= 1.01;
		}
		System.out.println(ans);
	}

}