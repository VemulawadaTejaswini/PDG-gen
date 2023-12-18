import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int checkA = 0;
		while(s.charAt(checkA) != 'A') {
			checkA++;
		}
		int startA = checkA;

		int checkZ = s.length() - 1;
		while(s.charAt(checkZ) != 'Z') {
			checkZ--;
		}

		int lastZ = checkZ;

		int ans = lastZ - startA + 1;
		System.out.println(ans);

	}

}