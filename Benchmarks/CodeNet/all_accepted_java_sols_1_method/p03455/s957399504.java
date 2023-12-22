import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		Boolean x = a % 2 == 0;
		Boolean y = b % 2 == 0;

		if (x || y) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}