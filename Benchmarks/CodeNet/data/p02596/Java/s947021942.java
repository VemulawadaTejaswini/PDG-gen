import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = Integer.parseInt(scan.next());
		scan.close();
		int ans = 0;
		int seven = 7;
		if ((K%2 == 0) || (K%5 == 0)) {
			System.out.println(-1);
		}	else {
			for (int i = 1;i <= K ;i++ ) {
				if (seven % K == 0) {
					ans = i;
					break;
				}
				seven = (seven * 10 + 7) % K;
			}
			System.out.println(ans);
		}
	}

}
