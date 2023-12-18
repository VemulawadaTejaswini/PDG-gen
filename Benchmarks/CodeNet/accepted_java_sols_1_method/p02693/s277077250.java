import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int i = 1;
		while(k*i <= b) {
			if(k*i >= a && k*i <=b) {
				System.out.println("OK");
				System.exit(0);
			}
			i++;
		}
		System.out.println("NG");
		sc.close();
	}
}
