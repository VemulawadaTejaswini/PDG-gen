import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int min = kb.nextInt();
		int count = 1;
		for (int i = 0; i < n - 1; i++) {
			int j = kb.nextInt();
			int b = j;
			if (b > min) {
			} else {
				count += 1;
				min = b;
			}
		}
		System.out.println(count);
		kb.close();
	}

}
