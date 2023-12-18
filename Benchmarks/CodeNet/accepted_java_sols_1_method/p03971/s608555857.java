import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String[] ranking = sc.next().split("");
		int success = 0;
		int rank_foreign = 1;
		for (String s : ranking) {
			switch (s) {
			case "c":
				System.out.println("No");
				break;
			case "a":
				if (success < a + b) {
					System.out.println("Yes");
					success++;
				} else {
					System.out.println("No");
				}
				break;
			case "b":
				if (success < a + b && rank_foreign <= b) {
					System.out.println("Yes");
					success++;
					rank_foreign++;
				} else {
					System.out.println("No");
				}
				break;
			}
		}

	}

}
