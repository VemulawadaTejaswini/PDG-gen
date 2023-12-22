import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputN = sc.next();
		String inputK = sc.next();

		int argN = Integer.parseInt(inputN);
		int argK = Integer.parseInt(inputK);

		if(argK*2-1 <= argN) {
			System.out.println("YES");
			sc.close();
		}else {
			System.out.println("NO");
			sc.close();
		}
	}
}