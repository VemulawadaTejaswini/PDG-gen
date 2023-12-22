import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split("/");
		if(Integer.parseInt(str[1]) <= 4) {

			System.out.println("Heisei");

		}else {

			System.out.println("TBD");

		}
	}
}
