import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next().chars().distinct().count() == 3 ? "Yes" : "No");
	}
}