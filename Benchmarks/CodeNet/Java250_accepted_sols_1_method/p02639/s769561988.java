import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int x1 = kb.nextInt();
		int x2 = kb.nextInt();
		int x3 = kb.nextInt();
		int x4 = kb.nextInt();
		int x5 = kb.nextInt();
		if (x1 == 0) {
			System.out.println(1);
		} else if (x2 == 0) {
			System.out.println(2);
		} else if (x3 == 0) {
			System.out.println(3);
		} else if (x4 == 0) {
			System.out.println(4);
		} else if (x5 == 0) {
			System.out.println(5);
		}
		kb.close();
	}

}
