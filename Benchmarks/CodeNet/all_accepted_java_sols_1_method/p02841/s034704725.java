import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int n1 = Integer.parseInt(sc.next());
		int d1 = Integer.parseInt(sc.next());
		if(n==n1) {
			System.out.print(0);
		}
		else {
			System.out.print(1);
		}
	}
}