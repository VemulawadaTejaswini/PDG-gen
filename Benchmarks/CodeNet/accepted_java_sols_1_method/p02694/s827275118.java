import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long total = 100;
		long result = 0;

		while(total < x) {
			total = (long) (total + total * 0.01);
			result++;
		}

		System.out.println(result);
	}

}
