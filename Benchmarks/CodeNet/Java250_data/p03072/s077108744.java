import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int check = 0, ans = 0;
		for(; N > 0; N--) {
			int hi = sc.nextInt();
			if(hi >= check) {
				check = hi;
				ans++;
			}
		}
		System.out.println(ans);
	}
}