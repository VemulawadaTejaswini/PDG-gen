import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int d = stdin.nextInt();
		if(a+b>c+d) {
			System.out.println("Left");
		}else if(a+b==c+d) {
			System.out.println("Balanced");

		}else {
			System.out.println("Right");

		}


		// TODO 自動生成されたメソッド・スタブ

	}

}
