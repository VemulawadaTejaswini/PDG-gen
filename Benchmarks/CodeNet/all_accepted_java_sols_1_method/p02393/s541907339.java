
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		while(a < 1 || 10000 < a);
		while(b < 1 || 10000 < b);
		while(c < 1 || 10000 < c);

		int[] list1 = {a,b,c};
		Arrays.sort(list1);
		System.out.println(list1[0]+" "+list1[1]+" "+list1[2]);
}

}

