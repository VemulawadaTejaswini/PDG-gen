import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 1;
		while(true) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			}else {
				while(true) {
					if(x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;
					if(x == 0) {
						break;
					}
				}
			}
			if(++i <= N) {
				continue;
			}else {
				break;
			}
		}
		System.out.println();
	}
}
