import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int cena_pociag = 0;
        int cena_bus = 0;
        if (A > B) {
            cena_pociag = B;
        } else {
            cena_pociag = A;
        }
        if (C > D) {
            cena_bus = D;
        } else {
            cena_bus = C;
        }

        System.out.println(cena_pociag+cena_bus);
    }
}
