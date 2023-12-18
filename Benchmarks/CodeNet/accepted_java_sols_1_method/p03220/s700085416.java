import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();

        int nearest = -1;
        double nearestDiff = 0;

        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();

            double diff = Math.abs(A - (T - h * 0.006));
            if ( nearest < 0 || diff < nearestDiff ) {
                nearest = i;
                nearestDiff = diff;
            }
        }

        System.out.println(nearest + 1);
    }
}
