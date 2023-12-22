import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int result = cubic(i);
		System.out.println(result);
		scanner.close();
	}
	public static int cubic(int i){
		return (int)(Math.pow(i, 3));
	}
}