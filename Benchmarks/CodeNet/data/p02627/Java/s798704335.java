import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(Character.isUpperCase(sc.next().charAt(0)) ? "A" : "a");
	}
}