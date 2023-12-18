import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,c;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}

		if(a < b && b < c) {
            System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

