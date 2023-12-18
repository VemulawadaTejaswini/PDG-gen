import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		if(a>=k) {
			System.out.println(k);
			return;
		}
		
		if(a+b>=k) {
			System.out.println(a);
			return;
		}

		System.out.println(a-(k-a-b));

	}

}
