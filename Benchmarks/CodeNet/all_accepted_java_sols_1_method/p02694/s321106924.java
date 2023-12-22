import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double yokin = 100;
		long X = scanner.nextLong();
		int i = 0;
		while(yokin < X) {
			yokin = Math.floor(yokin * 1.01);
			i++;
		}
		System.out.println(i);
	}
}
