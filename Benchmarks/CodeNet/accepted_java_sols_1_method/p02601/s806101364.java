import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int A = sc.nextInt(); //red
		int B = sc.nextInt(); //green
		int C = sc.nextInt(); //blue
		int K = sc.nextInt(); //num
		sc.close();

		int tryNum = 0;

		while(B <= A) {
			//gleen > red
			//B > A が終着点
			B *= 2;
			tryNum++;
		}

		while(C <= B) {
			//blue > green
			//C > Bが終着点
			C *= 2;
			tryNum++;

		}

		if(tryNum > K) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
