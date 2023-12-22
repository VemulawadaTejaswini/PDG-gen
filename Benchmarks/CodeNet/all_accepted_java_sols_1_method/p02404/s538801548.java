import java.util.Scanner;

/**
 * Created by malone on 2018/3/16.
 */
public class Main{

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);


        while (((a = scanner.nextInt()) != 0)&&((b = scanner.nextInt()) != 0)) {

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || i == a - 1) {
                        System.out.printf("#");
                    } else if (j == 0 || j == b - 1) {
                        System.out.printf("#");
                    } else {
                        System.out.printf(".");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }

    }
}

