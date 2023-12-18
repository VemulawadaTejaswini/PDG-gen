import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long t = sc.nextLong();
		System.out.println((X-t)>0?(X-t):0);
	}

}
