import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.next();
	String[] parts = input.split(" ");
	int a = Integer.parseInt(parts[0]);
	int b = Integer.parseInt(parts[1]);
	int area = a * b;
	int length = (a + b) * 2;
	System.out.println(area + " " + length);
    }
}