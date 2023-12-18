import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		double answer = 0.00;

		double omega = 6*M - 30*H - 0.5*M ;
//		System.out.println(omega);

		if(omega >= 0) {
			//長針の方が進むとき
			if(omega >= 180) {
				omega = 360 - omega;
			}else {
				//そのまま使えるオメガ
			}
		}else {
			//短針の方が進むとき
			if(omega <= -180) {
				omega = 360 + omega;
			}else {

			}
		}

		double radian = Math.toRadians(omega);
		answer = A*A + B*B -2*A*B*Math.cos(radian);
		answer = Math.sqrt(answer);
		System.out.println(answer);
	}

}
