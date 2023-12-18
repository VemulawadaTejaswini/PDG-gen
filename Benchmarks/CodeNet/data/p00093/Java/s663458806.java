
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mae = scanner.nextInt();
        int ato = scanner.nextInt();

        while (mae != 0 || ato != 0) {
            int flag = 0;
            for (int i = mae; i <= ato; i++) {
                if (i % 4 == 0) {
                    if (i % 100 == 0 && i % 400 != 0) {
                    } else {
                        System.out.println(i);
                        flag++;

                    }

                }
            }
            if (flag == 0) {
                System.out.println("NA");
            }

            mae = scanner.nextInt();
            ato = scanner.nextInt();
            if (mae != 0 && ato != 0) {
                System.out.println("");
            }
        }
    }
}

