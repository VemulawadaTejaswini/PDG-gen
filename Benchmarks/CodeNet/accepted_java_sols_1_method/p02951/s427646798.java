import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int R = C - (A - B);

		if(R >= 0) {
			System.out.println(R);
		}else {
			System.out.println("0");
		}
	}
}