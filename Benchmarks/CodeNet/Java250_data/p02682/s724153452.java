import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); //1が書かれたカードの枚数
		int B = sc.nextInt(); //0が書かれたカードの枚数
		int C = sc.nextInt(); //-1が書かれたカードの枚数
		int K = sc.nextInt(); //選ぶカードの枚数
		int sum = 0; //選んだカードの合計
		String flag = null;

		if(A >= K) { //選ぶカードは全部1
			flag = "A";
		}else if(A + B >= K) { //選ぶカードは1と0
			flag = "B";
		}else if (A + B + C >= K) { //選ぶカードは1と0と-1
			flag = "C";
		}else { //K = 0
			sum = 0;
		}

		switch(flag) {
		case "A":
			sum = K;
			break;
		case "B":
			sum = A;
			break;
		case "C":
			sum = A - (K - A - B);
		}

		System.out.print(sum);
	}

}
