
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int r = scan.nextInt();
		if(r == (-1)*h) {
			System.out.println(0);
		}else if(r < (-1)*h) {
			System.out.println(-1);
		}else {
			System.out.print(1);
		}
	}
}

