import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long D = scanner.nextLong();

        int R = 0;
        for (int i = 0; i < N; i++) {
            long X = scanner.nextLong();
            long Y = scanner.nextLong();

            if (X*X + Y*Y <= D*D){
                R++;
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}