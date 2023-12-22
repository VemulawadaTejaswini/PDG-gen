import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i=1; i*k<=b; i++){
			if (i*k >= a && i*k <=b){
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");
	}
}