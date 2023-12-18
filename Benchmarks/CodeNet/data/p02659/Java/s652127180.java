import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = (long) (scan.nextDouble()*100);
		long ans = A*B;
		ans = ans / 100;
		System.out.println((long)Math.floor(ans));
	}

}