import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/22.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n, count, number;
        String line;
        char button[];
        char keitaiButton[][] = {
                {'.', ',', '!', '?', ' '},
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            line = sc.next();
            button = line.toCharArray();
            count = 0;
            for (int j = 0; j < button.length; j++) {
                while (button[j] - '0' != 0) {
                    count++;
                    j++;
                }
                if(count > 0) {
                    System.out.print(keitaiButton[(button[j - 1] - '0') - 1][(count - 1) % keitaiButton[(button[j - 1] - '0') - 1].length]);
                    count = 0;
                }
            }
            System.out.println();
        }
    }
}