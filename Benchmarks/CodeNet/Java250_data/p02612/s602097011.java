import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int pay = 1000;
		int ans = 0;
		for (int i = 1;i <= 10 ;i++ ) {
			if (pay >=N) {
				ans = pay - N;
				break;
			}
			pay+=1000;
		}

		System.out.println(ans);
	}

}
