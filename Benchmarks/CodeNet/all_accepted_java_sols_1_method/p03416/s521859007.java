import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    int i1 = Integer.parseInt(""  + k + j + i + j + k );
                    if (A <= i1 && i1 <= B) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
