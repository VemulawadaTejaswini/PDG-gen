import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x/100;
		if((x-a*100) <= 5*a) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}