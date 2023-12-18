import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m, c, sum;
		while ((m = s.nextInt()) != 0) {
			c = 1000 - m;
			sum = 0;
			while (c - 500 >= 0) { c -= 500; sum += 1; }
			while (c - 100 >= 0) { c -= 100; sum += 1; }
			while (c -  50 >= 0) { c -=  50; sum += 1; }
			while (c -  10 >= 0) { c -=  10; sum += 1; }
			while (c -   5 >= 0) { c -=   5; sum += 1; }
			while (c -   1 >= 0) { c -=   1; sum += 1; }
			System.out.println(sum);
		}
	}
}