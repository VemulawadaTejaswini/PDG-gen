import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int b = 0;
			int c = 0;
			boolean acFlag = true;
			for (int j = 0; j < 10; j++) {
				int number = scan.nextInt();
				if (number > b) {
					b = number;
					continue;
				}
				if (number > c) {
					c = number;
					continue;
				}
				acFlag = false;
			}
			System.out.println(acFlag?"YES":"NO");
		}
	}
}