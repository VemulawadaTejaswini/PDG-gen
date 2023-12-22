import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String s = String.format("%1$d:%2$d:%3$d", x / 3600, (x % 3600) / 60, x % 60);
		System.out.println(s);
	}

}