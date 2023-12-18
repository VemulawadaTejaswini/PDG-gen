import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int ans = (int) (n + Math.pow(n,2) + Math.pow(n,3));

            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}