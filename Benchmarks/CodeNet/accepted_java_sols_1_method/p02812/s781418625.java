import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();

            int c = 0;
            for (int i = 0; i < N - 2; i++) {
                if (S[i] == 'A' && S[i + 1] == 'B' && S[i + 2] == 'C') {
                    c++;
                }
            }

            System.out.println(c);
        }
    }

}
