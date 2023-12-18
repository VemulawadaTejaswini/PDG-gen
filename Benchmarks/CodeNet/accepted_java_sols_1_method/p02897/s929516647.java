
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		double odd = 0;
		for(int i = 1; i <= a; i++)
			if(i % 2 == 0)
				odd++;
		System.out.printf("%.10f", (1 - (odd / a)));
	}
}