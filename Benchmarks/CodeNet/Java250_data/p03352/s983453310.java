import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        System.out.println( solve(X) );
    }

    private static int solve(int X) {
        int max = 1;
        int B = (int)Math.floor(Math.sqrt(X));

        loop: for (int b = 2; b <= B ; b++) {
            for (int p = 2; p < 100; p++) {
                int r = (int)Math.pow(b, p);
                if( r > X ) {
                    continue loop;
                }
                max = Math.max((int)Math.pow(b, p), max);
            }
        }
        return max;
    }
}
