import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a <= b){
			// 出力
			System.out.println(a);
		} else {
			// 出力
			System.out.println( a-1 );
		}
	}
}