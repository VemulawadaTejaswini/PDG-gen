import java.util.Scanner;

/**
 * ABC Swap
 */
public class Main {

	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append(z).append(" ")
				.append(x).append(" ")
				.append(y);
			System.out.println(sb.toString());
		}
	}
}