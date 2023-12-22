import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int A = in.nextInt();
			int B = in.nextInt();
			int ans = 0;
			for (int i = 0; i < 2; i++) {
				if (A <= B) {
					ans += B;
					B--;
				} else {
					ans += A;
					A--;
				}
			}
			
			System.out.println(ans);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
