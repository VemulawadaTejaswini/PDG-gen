import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strings = line.split(" ");
		int a = Integer.parseInt(strings[0]);
		int b = Integer.parseInt(strings[1]);
		int c = Integer.parseInt(strings[2]);
		if (a < b && b < c && a < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}