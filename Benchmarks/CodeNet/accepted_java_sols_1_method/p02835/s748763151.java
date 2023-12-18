import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() +  sc.nextInt() + sc.nextInt() > 21) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}
}