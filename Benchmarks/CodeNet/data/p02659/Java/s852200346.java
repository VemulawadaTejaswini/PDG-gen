import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		double B = scan.nextDouble();
		B = B*100;
		long ans = (long) (A*B);
		ans = ans / 100;
		System.out.println((long)Math.floor(ans));
	}

}