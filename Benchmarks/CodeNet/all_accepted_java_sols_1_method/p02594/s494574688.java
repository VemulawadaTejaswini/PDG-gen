import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            String ans = "Yes";
            if (x <  30) {
            	ans = "No";
            }

            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
