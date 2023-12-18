
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		if(n >= m) {
			ans = 10;
		}
		System.out.println(ans);
		sc.close();
	}


}
