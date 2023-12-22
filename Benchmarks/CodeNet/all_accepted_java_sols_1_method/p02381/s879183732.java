
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (0 == 0) {

            int ninzu = scanner.nextInt();
            if (ninzu == 0) {
                break;
            }
            double[] tensu = new double[ninzu];

            for (int i = 0; ninzu > i; i++) {
                tensu[i] = scanner.nextInt();
            }

            double goukei = 0;

            for (int i = 0; ninzu > i; i++) {
                goukei += tensu[i];
            }

            double heikin = goukei / ninzu;

            double bunsan = 0;

            for (int i = 0; ninzu > i; i++) {
                bunsan += (tensu[i] - heikin) * (tensu[i] - heikin) / ninzu;
            }
            double bunsan2;
            bunsan2 = Math.sqrt(bunsan);

            System.out.println(bunsan2);
        }
    }
}