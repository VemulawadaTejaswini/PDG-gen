import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
		   int x = sc.nextInt();
			int ans = 0;
			if (x == 0) {
				ans = 1;
			}
           System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
