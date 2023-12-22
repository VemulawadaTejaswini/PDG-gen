import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		while(2*num <= n) {
			num *= 2;
		}
		System.out.println(num);
		sc.close();
	}

}
