import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		int x;
		while (i <= n) {
			x = i;
			while (true){
				if (x % 3 == 0) {
					System.out.printf(" %d", i);
					break;
				}
				while (x >= 1) {
					if (x % 10 == 3){
						System.out.printf(" %d", i);
						break;
					}
					x /= 10;
				}
				break;
			}
			i++;
		}
		System.out.printf("\n");
	}
}

