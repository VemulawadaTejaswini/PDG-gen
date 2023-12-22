import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		int a = sn.nextInt();
		int b = sn.nextInt();
		
		int sum = a + b;
		int minus = a - b;
		int kakeru = a * b;
		
		if (sum >= minus && sum >= kakeru) {
			System.out.println(sum);
		} else if (minus >= sum && minus >= kakeru) {
			System.out.println(minus);
		} else if (kakeru >= sum && kakeru >= minus) {
			System.out.println(kakeru);
		}
	}
	
}
