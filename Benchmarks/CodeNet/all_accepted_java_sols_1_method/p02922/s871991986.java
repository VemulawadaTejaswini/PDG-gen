import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int sum = 1;
		int count = 0;

		while(sum < b) {
			sum += (a-1);
			count++;
		}

		System.out.println(count);

	}
}