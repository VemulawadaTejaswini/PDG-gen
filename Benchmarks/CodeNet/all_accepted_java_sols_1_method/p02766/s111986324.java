import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int ans = 0;
		while(n > 0){
			n /= k;
			ans++;
		}
		sc.close();
		System.out.println(ans);
	}
}
