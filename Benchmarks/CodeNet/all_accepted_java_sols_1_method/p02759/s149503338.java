import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		if (i % 2 == 0) {
			System.out.println(i / 2);
		} else {
			System.out.println(i / 2 + 1);
		}
		kb.close();
	}

}
