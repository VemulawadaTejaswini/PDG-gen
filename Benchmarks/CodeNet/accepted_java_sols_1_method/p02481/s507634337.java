import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n1 = scan.nextInt();
	int n2 = scan.nextInt();

	int area = n1 * n2;
	int length = (n1 + n2) *2;

	System.out.println(area + " " + length);
    }
}