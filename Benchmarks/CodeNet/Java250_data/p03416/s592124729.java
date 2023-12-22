import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int count = 0;

		for (int i = A; i <= B; i++) {
			String str = String.valueOf(i);
			if (str.substring(0, 1).equals(str.substring(4, 5))) {
				if (str.substring(1, 2).equals(str.substring(3, 4))) {
					count++;
				}

			}
		}
		System.out.println(count);
	}
}