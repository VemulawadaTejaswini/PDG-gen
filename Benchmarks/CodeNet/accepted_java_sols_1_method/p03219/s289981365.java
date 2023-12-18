import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int train = scanner.nextInt();
		int bus = scanner.nextInt();
		
		System.out.println(train + bus/2);
	}

}