import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a==b) {
			System.out.println(c);
		}else if(b==c) {
			System.out.println(a);
		}else if(a==c) {
			System.out.println(b);
		}
	}

}
