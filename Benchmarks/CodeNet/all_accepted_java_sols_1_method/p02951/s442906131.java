import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int empty = A - B;
		int ret = C- empty;
		if(ret < 0){
			ret = 0;
		}
		System.out.println(ret);

		sc.close();
	}
}
