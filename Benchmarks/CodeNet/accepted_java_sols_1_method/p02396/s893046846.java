import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);

		for(int i = 1;;i++) {
		int a = sc.nextInt();
		if(a == 0)
			break;
		System.out.println("Case " + i  + ": " + a);
		}
	}
}

