import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] input = sc.next().split("");
		int x = 0;
		int max = 0;
		for (String element : input) {
			if (element.equals("I")) {
				x++;
			} else {
				x--;
			}
			if (x > max) {
				max = x;
			}
		}
		System.out.println(max);
	}
}
