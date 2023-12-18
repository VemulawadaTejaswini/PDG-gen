
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mae = scanner.nextInt();
        while (mae != -1) {
            int yon = 1;
            int kari = mae;
            long dasu = 0;
            int kake = 1;

            long keta = 1;
            while (kari > 0) {
                int amari = kari % 4;
                int shou = kari / 4;
                dasu += amari * keta;
                keta *= 10;
                kari = shou;
            }

            System.out.println(dasu);

            mae = scanner.nextInt();
        }
    }
}

