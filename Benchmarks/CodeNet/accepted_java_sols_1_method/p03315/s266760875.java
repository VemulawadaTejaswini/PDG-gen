import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int count = 0;

		for(int i = 0; i < 4; i++) {
			String syb = S.substring(i, i + 1);
			if(syb.equals("+")) {
				count++;
			}else {
				count--;
			}
		}
		System.out.println(count);

	}
}