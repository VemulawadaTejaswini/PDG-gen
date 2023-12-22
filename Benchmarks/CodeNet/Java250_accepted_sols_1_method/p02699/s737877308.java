import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] list = scanner.nextLine().split(" ");

		if(Integer.parseInt(list[0]) <= Integer.parseInt(list[1])) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}

	}
}