import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t = a % 10;
		if (t == 3) {
			System.out.println("bon");
		} else if (t== 0 || t== 1 || t== 6|| t==8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}
