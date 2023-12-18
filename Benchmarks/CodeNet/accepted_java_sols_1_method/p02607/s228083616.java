import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AISing_B
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int a = 0;

		for(int i=1; i <= N; i++) {
			a = sc.nextInt();
			if(i%2==1 && a%2==1) {
				cnt++;
			}
		}

		System.out.println(cnt);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
