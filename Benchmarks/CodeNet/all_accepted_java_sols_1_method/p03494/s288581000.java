import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] a = new String[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.next();
		}

		int cnt = 0;
		int divCnt = 0;

		boolean continueFlg = true;

	while(continueFlg) {
			for (int i = 0; i < N; i++) {
				if(Integer.parseInt(a[i]) % 2 == 0 ) {
					a[i] = String.valueOf(Integer.parseInt(a[i]) / 2);
					divCnt ++;
				}
			}
			if(divCnt == N) {
				divCnt = 0;
				cnt++;
			} else {
				continueFlg = false;
			}
		}
	System.out.println(cnt);
	}
}

