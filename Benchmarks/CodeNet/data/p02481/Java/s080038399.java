import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int high = sc.nextInt();
		int wide = sc.nextInt();

		System.out.println((high * wide) + " " + (high * 2 + wide * 2));

	}

}