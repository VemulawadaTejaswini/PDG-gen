import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		Long n = sc.nextLong();
		Long k = sc.nextLong();

		System.out.println(Math.min(n%k, k-n%k));
	}

}