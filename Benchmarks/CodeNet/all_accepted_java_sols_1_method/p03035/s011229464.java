import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		//logic
		int answer = B;
		if(A <= 5){
			answer = 0;
		}else if (A > 5 && A <= 12) {
			answer /= 2;
		}

		//logic
		System.out.print(answer);

	}

}
