import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double hX = 0.0, hY = 0.0, mX = 0.0, mY = 0.0;

        double hKakudo = H * 30;
        double mKakudo = M * 6;

        hX = Math.cos(Math.toRadians(hKakudo)) * (double) A;
        hY = Math.sin(Math.toRadians(hKakudo)) * (double) A;

        mX = Math.cos(Math.toRadians(mKakudo)) * (double) B;
        mY = Math.sin(Math.toRadians(mKakudo)) * (double) B;

        double kyori = Math.sqrt((hX - mX) * (hX - mX) + (hY - mY) * (hY - mY));


        System.out.println(kyori);
    }
}
