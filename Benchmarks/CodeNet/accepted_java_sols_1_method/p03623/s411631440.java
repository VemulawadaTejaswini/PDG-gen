import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int aL=0;
		int bL=0;

		aL = Math.abs(x-a);
		bL = Math.abs(x-b);
		if(aL<bL) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}

}
