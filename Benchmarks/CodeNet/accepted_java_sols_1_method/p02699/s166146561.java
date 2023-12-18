import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int W = sc.nextInt();



		if(S == W || S < W) {
			System.out.println("unsafe");
		}

		else {
			System.out.println("safe");
		}

		sc.close();
	}

}
