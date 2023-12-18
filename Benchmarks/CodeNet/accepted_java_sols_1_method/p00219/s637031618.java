
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            int kosu[] = new int[10];

            // kosu[0] ... アイス0の売り上げ数
            // kosu[1] ... アイス1の売り上げ数
            //  :
            // kosu[9] ... アイス9の売り上げ数
            for (int i = 0; i < n; ++i) {
                int ico = scanner.nextInt();
                kosu[ico]++;
            }
            for (int i = 0; i < 10; ++i) {
                if (kosu[i] == 0) {
                    System.out.println("-");
                } else {
                    for (int j = 0; j < kosu[i]; ++j) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

            }
            n = scanner.nextInt();
        }
    }
}

