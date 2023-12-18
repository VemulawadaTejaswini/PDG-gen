import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] attendance = new boolean[30];
		for (int i = 0; i < 30; i++) {
			attendance[i] = false;
		}
		
		for (int i = 0; i < 28; i++) {
			attendance[scan.nextInt()-1] = true;
		}
		
		for (int i = 0; i < 30; i++) {
			if (!attendance[i]) {
				System.out.println(i+1);
			}
		}
	}
}