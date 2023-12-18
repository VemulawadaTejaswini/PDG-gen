import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		if(c - a - b > 0 && (4 * a * b < (c - a - b) * (c - a - b)))
			System.out.print("Yes");
		else
			System.out.print("No");
		}
}