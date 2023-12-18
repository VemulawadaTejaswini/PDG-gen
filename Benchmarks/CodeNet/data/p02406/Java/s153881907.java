import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0 || x % 10 == 3) {
				System.out.print(" " + i);
			}else {
				x /= 10;
				if(x % 3 == 0 || x % 10 == 3){
					System.out.print(" " + i);
				}
			}
		}
	System.out.println("");
}
}