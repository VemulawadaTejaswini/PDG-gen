import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	long N = scanner.nextLong();
	 	long x = 0;
	 	long y = 0;
	 	long sum = 0;
	 	x = N / 15;
	 	y = N % 15;
	 	sum = (60 + 60 + 120 * (x - 1)) * x / 2;
	 	if (y == 1) {
	 		sum += 1 + 15 * x;
	 	} else if (y == 2 || y == 3) {
	 		sum += 3 + 15 * x * 2;
	 	} else if (y == 4 || y == 5 || y == 6) {
	 		sum += 7 + 15 * x * 3;
	 	} else if (y == 7) {
	 		sum += 14 + 15 * x * 4;
	 	} else if (y == 8 || y == 9 || y == 10) {
	 		sum += 22 + 15 * x * 5;
	 	} else if (y == 11 || y == 12) {
	 		sum += 33 + 15 * x * 6;
	 	} else if (y == 13) {
	 		sum += 46 + 15 * x * 7;
	 	} else if (y == 14) {
	 		sum += 60 + 15 * x * 8;
	 	}
	 	//System.out.println(x);
	 	//System.out.println(y);
	 	System.out.println(sum);
 	}
}
