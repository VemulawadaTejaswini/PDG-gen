import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(time*a<b) {
			System.out.println(time*a);
		}else {
			System.out.println(b);
		}
	}
}
