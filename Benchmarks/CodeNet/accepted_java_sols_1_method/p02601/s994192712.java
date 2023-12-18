import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int k = sc.nextInt();
		boolean ans = false;

		for (int i=1; i<=k; i++){

			if (a >= c || b >= c){
				c = c * 2;
			} else if (a >= b){
				b = b * 2;
			}

			if (a < b && b < c){
				ans = true;
				break;
			}
		}
		if (ans){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}


}