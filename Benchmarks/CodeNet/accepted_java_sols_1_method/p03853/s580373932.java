import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		for(int i = 0; i < H; i++) {
			String receive = sc.next();
			System.out.println(receive);
			System.out.println(receive);
		}

		sc.close();
	}

}
