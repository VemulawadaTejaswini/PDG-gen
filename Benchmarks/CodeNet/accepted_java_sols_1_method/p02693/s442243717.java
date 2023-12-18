import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int a = kb.nextInt();
		int b = kb.nextInt();
		boolean t = false;
		for (int i = a; i <= b; i++) {
			if (i % k == 0) {
				System.out.println("OK");
				t = true;
				break;
			}
		}
		if (t == false)
			System.out.println("NG");
		kb.close();
	}

}
