import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//高橋君の体力
		int A = sc.nextInt();
		//高橋君の攻撃力
		int B = sc.nextInt();
		//青木君の体力
		int C = sc.nextInt();
		//青木君の攻撃力
		int D = sc.nextInt();

		while(true) {
		if(B >= C ) {
			//
			System.out.println("Yes");
			break;
		}
		C = C - B;
		if(A <= D) {
		System.out.println("No");
		break;
	}
		A = A-D;
		}
		sc.close();
	}

}
