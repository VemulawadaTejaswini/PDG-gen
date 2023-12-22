import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int a, b;
	try(Scanner scanner = new Scanner(System.in)) {
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	}
	int perimeterLength = 2 * (a + b);
	int area = a * b;
	System.out.println(area + " " + perimeterLength);
    }
}