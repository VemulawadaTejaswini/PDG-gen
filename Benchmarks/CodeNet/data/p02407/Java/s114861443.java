import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		List<Integer> iary = new ArrayList<>();
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			iary.add(stdIn.nextInt());
		}

		for (int i = n-1; i >= 0; i--) {
			System.out.print(iary.get(i));
			if(i == 0) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}

}