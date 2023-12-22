import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int ans = 0;
		for(int i = 1 ;; i++) {
			if(x < y * i + z * (i + 1)) {
				break;
			} else {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
