import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int one = in.nextInt();
		int two = in.nextInt();
		for(int i = 1; i < 4; i++) {
			if((i * one * two) % 2 != 0) {
				System.out.println("Yes");
				return;
			}
				
		}
		System.out.println("No");
		}
}
