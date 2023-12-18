import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		StringBuffer sBuffer = new StringBuffer(scanner.next());
		System.out.println(sBuffer.reverse());
	}
}