import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();

		int i = 0;
		long money = 100;
		while(true) {
			i++;
			money *= 1.01;
			if(money >= X) {
				break;
			}
		}
		System.out.println(i);
	}

}
