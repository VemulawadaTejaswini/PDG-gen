import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;

		if(B < A){
			sum = sum + A;
			A--;
		}else{
			sum = sum + B;
			B--;
		}

		if(B < A){
			sum = sum + A;
			A--;
		}else{
			sum = sum + B;
			B--;
		}

		System.out.println(sum);

		sc.close();
	}
}
