import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("a " + (a == b ? "==" : (a < b ? "<": ">")) + " b");
		} finally {
			sc.close();
		}
	}

}