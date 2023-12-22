import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		long count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 5 != 0 && i % 15 != 0) {
				count += i;
			}
		}
		System.out.println(count);
		kb.close();
	}

}
