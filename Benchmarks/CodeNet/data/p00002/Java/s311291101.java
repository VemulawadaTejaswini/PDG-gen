import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		while (scanner.hasNextLine()) {
			String[] xy = scanner.nextLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			sb.append(String.valueOf(x + y).length()).append("\n");
		}
		System.out.print(sb.toString());
	}
}