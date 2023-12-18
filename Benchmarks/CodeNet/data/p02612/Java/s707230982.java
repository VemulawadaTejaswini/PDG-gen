import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int ans = 0;
            int x = 0;
            for (int i = 0; x < n; i++) {
            	x = i * 1000;
            }
            
            ans = x - n;

            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}