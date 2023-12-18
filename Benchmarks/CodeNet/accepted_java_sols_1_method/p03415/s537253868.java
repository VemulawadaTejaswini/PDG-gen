import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] array = new char[3];
		for (int i = 0; i < 3; i++) {
			array[i] = sc.next().charAt(i);
		}
		System.out.println("" + array[0] + array[1] + array[2]);
	}
}