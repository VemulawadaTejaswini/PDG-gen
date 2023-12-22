import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());

        int index = -1;

        double minError = Double.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int h  = Integer.parseInt(sc.next());

            double error = Math.abs(T - h * 0.006 - A);

            if (error < minError) {
                index = i;
                minError = error;
            }
        }

        System.out.println(index + 1);
    }
}
