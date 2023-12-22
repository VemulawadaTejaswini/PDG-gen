import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		// 出力
		if((B-A)%2==0){
			System.out.println("Alice");
		}else{
			System.out.println("Borys");
		}
	}
}
