import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().substring(0, 1) + sc.next().substring(0, 1) + sc.next().substring(0, 1);
		System.out.println(str.toUpperCase());
	}
}

