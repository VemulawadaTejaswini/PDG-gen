import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = a*a;
		int ans = a+b;
		b=a*a*a;
		ans=ans+b;


		System.out.println(ans);

	}

}
