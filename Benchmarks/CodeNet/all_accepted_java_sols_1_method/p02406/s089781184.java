import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), nabeatsu;

        for (int i=3; i<=n; i++) {
            nabeatsu = i;
            if (nabeatsu % 3 == 0) {
                System.out.print(" " + i);
                continue;
            }
            while (nabeatsu != 0) {
                if (nabeatsu % 10 == 3) {
                    System.out.print(" " + i);
                    break;
                }
                nabeatsu /= 10;
            }
        }
        System.out.println();
    }
}