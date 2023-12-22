
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char[] abc = { 'A', 'B', 'C' };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        char[] S = sc.next().toCharArray();

        int count = 0;
        for (int i = 0; i < S.length - 2; i++) {
            char[] sub = Arrays.copyOfRange(S, i, i + 3);

            if (Arrays.equals(sub, abc)) {
                count++;
            }
        }

        System.out.println(count);

    }

}
