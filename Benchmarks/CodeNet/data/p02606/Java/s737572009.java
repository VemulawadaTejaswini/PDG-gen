import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int d = sc.nextInt();

            int count = 0;

            for (int i = min; i <= max; i++) {
            	if (i % d == 0) {
            		count++;
            	}
            }

            System.out.println(count);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}