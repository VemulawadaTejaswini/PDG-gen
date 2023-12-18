import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

		int ans = 0;
		int iN = 0;
		for(int i=0; i<N.length(); i++) {
			iN = Integer.parseInt(String.valueOf(N.charAt(i)));
			ans = (ans+ iN)%9;
		}

		if(ans == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
