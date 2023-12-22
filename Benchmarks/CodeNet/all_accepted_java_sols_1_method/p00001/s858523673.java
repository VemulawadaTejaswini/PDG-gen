import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<Integer>();
		Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			height.add(sc.nextInt());
		}

		Collections.sort(height);

		for (int i = 9; i > 6; i--) {
			System.out.println(height.get(i));
		}

	}

}