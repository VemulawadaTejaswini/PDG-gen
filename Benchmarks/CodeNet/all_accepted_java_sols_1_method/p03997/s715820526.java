import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer h = sc.nextInt();
		
		System.out.println((a + b) * h / 2);
	}
}
