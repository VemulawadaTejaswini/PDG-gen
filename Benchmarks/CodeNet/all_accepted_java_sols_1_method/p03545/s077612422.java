import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int ABCD = sc.nextInt();

		int[] kurai = new int[4];
		for(int i=0; i<4; i++) {
			kurai[3-i] = ABCD % 10;
			ABCD /= 10;
		}

		//bit全探索
		for(int i=0; i<(1 << 3); i++) {
			String[] fugou = new String[3];
			int ans = kurai[0];
			for(int j=0; j<3; j++) {
				if((1 & (i>>j)) == 1) {
					fugou[j] = "+";
					ans += kurai[j+1];
				}else {
					fugou[j] = "-";
					ans -= kurai[j+1];
				}
			}

			if(ans == 7) {
				for(int j=0; j<3; j++) {
					System.out.print(kurai[j] + fugou[j]);
				}
				System.out.println(kurai[3] + "=" + ans);
				break;
			}
		}

	}

}
