import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		for(int i=0;i<=x;i++) {
			if(2*i+4*(y-i)==y) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}
