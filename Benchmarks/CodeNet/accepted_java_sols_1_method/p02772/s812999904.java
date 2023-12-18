import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean canin = true;
		int inputn = sc.nextInt();

		for(int i = 0; i < inputn; i++) {
			int num = sc.nextInt();
			if((num % 2) == 0) {
				if((num % 3 == 0) || num % 5 == 0 ) {

				}else {
					canin = false;
				}
			}
		}

		if(canin) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}

	}
}