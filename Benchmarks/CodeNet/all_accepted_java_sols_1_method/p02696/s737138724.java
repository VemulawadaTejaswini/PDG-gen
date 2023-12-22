import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

				Scanner scan = new Scanner(System.in);

				long A = scan.nextLong();
				long B = scan.nextLong();
				long N = scan.nextLong();

				System.out.println( A * Math.min(B-1, N)/B);

	}

}