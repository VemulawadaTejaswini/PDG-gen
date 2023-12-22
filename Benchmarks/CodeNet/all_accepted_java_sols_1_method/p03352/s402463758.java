import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 0;
		for(int i = 2 ; i <= x ;  i++) {
			for(int j = 2 ; (int)Math.pow(i, j) <= x ; j++) {
				ans = Math.max(ans, (int)Math.pow(i, j));
			}
		}
		if(ans == 0) {
			System.out.println(1);
		} else {
			System.out.println(ans);
		}
	}
}
