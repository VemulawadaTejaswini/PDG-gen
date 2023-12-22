import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int r, D, a = 0;
			r = sc.nextInt();
			D = sc.nextInt();
			a = sc.nextInt();

			for (int i = 1; i <= 10; i++) {
				int cal = r*a - D;
				System.out.println(cal);
				a = cal;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
