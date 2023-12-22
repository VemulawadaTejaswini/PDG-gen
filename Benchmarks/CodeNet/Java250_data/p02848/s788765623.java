import java.util.Scanner;

/**
 * ROT N
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();

            for (int i = 0; i < S.length; i++) {
                int c = S[i] - 'A';
                S[i] = (char) ((c + N) % 26 + 'A');
            }

            System.out.println(String.valueOf(S));
        }
    }

}
