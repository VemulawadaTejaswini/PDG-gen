import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(b>=a) {
			System.out.println(a);
		}
		else {
			System.out.println(a-1);
		}
	}
}
