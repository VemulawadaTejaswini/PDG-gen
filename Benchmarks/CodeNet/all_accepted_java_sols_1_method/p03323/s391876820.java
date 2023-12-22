import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a<=8 && b <=8 ? "Yay!" : ":(");
	}

}
