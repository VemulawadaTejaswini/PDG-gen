import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		if(X % (Y+Z) < Z) {
			System.out.print(X / (Y+Z) - 1);
		}else if(X % (Y + Z) >= Z ) {
			System.out.print(X / (Y+Z));
		}
	}

}