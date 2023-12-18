import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            boolean ans = true;
            if (x <  30) {
            	ans = false;
            }

            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
