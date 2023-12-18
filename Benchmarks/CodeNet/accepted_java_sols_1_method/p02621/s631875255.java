import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = a*a;
		int ans = a+b;
		b=a*a*a;
		ans=ans+b;


		System.out.println(ans);

	}

}
