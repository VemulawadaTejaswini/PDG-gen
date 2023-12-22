import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        double w = sc.nextInt();
        double h = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double s = 0;
        int cnt = 0;
        
        s = (w * h) / 2;

        if (2 * x == w && 2 * y == h) {
            cnt = 1;
        }

        System.out.println(s+" "+cnt);

		sc.close();
	}
}
