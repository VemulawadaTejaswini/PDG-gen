import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		boolean flg = false;
		for(int i = 1; i < 1010; i ++) {
			if(Math.floor(i * 0.08) == A && Math.floor(i * 0.10) == B) {
				System.out.println(i);
				flg = true;
				break;
			}
		}
		if(flg == false) {
			System.out.println(-1);
		}
	}
}