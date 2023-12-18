import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < 4; i++) {
			if(n%10 == 2) {
				ans ++;
			}
			n /= 10;
		}
		System.out.println(ans);
		sc.close();
	}
}
