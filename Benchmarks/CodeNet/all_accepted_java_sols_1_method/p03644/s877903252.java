import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;
		int ans = 0;
		for(int i = 0; i <= 7; i++) {
			int tmp = (int) Math.floor(Math.pow(2, i));
			if(tmp <= N) {
				continue;
			}else {
				ans = (int) Math.floor(Math.pow(2, i - 1));
				break;
			}
		}
		System.out.println(ans);
	}

}