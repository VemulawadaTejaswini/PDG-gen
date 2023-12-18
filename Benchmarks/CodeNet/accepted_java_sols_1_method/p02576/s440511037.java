import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		sc.close();

		int aa = n/x;
		if(n%x==0) {
			System.out.println(aa*t);
		}else {
			System.out.println((aa+1)*t);
		}



	}
}
