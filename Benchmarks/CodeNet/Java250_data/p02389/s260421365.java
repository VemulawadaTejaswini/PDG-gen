import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		System.out.println(String.valueOf(length * width) + " " + String.valueOf(length * 2 + width * 2));
	}
}