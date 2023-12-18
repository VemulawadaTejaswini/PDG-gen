import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);

		for(int i = 0;;i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0&&b == 0)
			break;
		for(int j = 0;j < a; j++) {
			for(int k = 0; k < b; k++) {
				System.out.print("#");
			}
			System.out.println("");

		 }
		System.out.println("");
		}
	}
}

