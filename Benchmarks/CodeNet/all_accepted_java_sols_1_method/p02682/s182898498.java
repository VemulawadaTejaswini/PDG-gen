import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		
		if(k < a) {
			ans = k;
		}else {
			ans = a;
		}

		if(0 < k - a - b) {
			ans -= k - a -b;
		}

		System.out.println(ans);
		sc.close();
	}

}