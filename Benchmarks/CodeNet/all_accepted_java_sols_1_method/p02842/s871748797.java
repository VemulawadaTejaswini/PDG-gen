import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans_a = (int)Math.floor(num / 1.08);
		int ans_b = (int)Math.ceil(num / 1.08);
		int chk = (int)Math.floor(ans_a * 1.08);
		if (chk == num) {
			System.out.println(ans_a);
		}else {
			chk = (int)Math.floor(ans_b * 1.08);
			if (chk == num) {
				System.out.println(ans_b);
			}else {
				System.out.println(":(");
			}
		}
	}
}
