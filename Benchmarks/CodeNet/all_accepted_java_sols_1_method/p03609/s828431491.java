import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(),t = sc.nextInt();
		System.out.println(X - t < 0 ? "0" : ""+(X-t));
	}
}
