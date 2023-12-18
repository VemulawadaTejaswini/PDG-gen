import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.valueOf(sc.nextLine());
			int count = 0;

			for (int i = 1; i <= n; i++) {
				int content = sc.nextInt();
				if (i % 2 == 1 && content % 2 == 1) {
					count ++;
				}
			}

			System.out.println(count);


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
