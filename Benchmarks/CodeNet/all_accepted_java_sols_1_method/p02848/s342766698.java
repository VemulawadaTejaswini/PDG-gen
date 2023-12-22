
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();

        for (int i = 0 ; i < S.length ; i++) {
            char c = (char) ((S[i] - 'A' + N) % 26 + 'A');
            System.out.print(c);
        }
        System.out.println();
    }
}
