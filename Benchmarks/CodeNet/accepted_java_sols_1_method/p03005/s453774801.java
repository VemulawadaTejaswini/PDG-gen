
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		if(k != 1) {
			ans = n-k;
		}
		System.out.println(ans);
		sc.close();
	}
	
	
}
