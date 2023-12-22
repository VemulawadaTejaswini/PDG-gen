import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MPERH = 60;
        final int SPERM = 60;

        int S = scanner.nextInt();

        int h = S / (MPERH * SPERM);
        int m = (S % (MPERH * SPERM)) / SPERM;
        int s = S % SPERM;

        System.out.println(h + ":" + m + ":" + s);
    }
}