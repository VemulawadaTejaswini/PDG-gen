import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a > k) {
			if(b / k >= 2) {
				System.out.println("OK");
				return;
			}
		} else if(a == k) {
			System.out.println("OK");
			return;
		} else if(b >= k){
			System.out.println("OK");
			return;
		}
		System.out.println("NG");
	}
}
