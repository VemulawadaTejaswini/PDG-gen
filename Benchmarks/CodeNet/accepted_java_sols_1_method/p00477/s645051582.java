import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}

}