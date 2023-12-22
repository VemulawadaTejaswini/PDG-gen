import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n % 111 == 0) {
			System.out.println(n);
		}else {
			for(int i = 111; i <= 999; i+=111) {
				if(n <= i) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}