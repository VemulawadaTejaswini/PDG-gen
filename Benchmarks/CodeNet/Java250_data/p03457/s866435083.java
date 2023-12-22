import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t_prev = 0;
        int x_prev = 0;
        int y_prev = 0;

        for (int i=0; i<N; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int distance = Math.abs(x - x_prev) + Math.abs(y - y_prev);
            if (distance > (t - t_prev) || (distance - (t - t_prev)) % 2 != 0){
            	System.out.println("No");
            	return;
            }
            t_prev = t;
            x_prev = x;
            y_prev = y;
        }
        System.out.println("Yes");
    }
}
