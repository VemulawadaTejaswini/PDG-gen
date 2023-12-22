import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int w = kb.nextInt();
		if (w >= s) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
		kb.close();
	}

}
