import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();
            char[] T = sc.next().toCharArray();

            char[] U = new char[N * 2];
            for (int i = 0; i < N; i++) {
                U[i * 2] = S[i];
                U[i * 2 + 1] = T[i];
            }

            System.out.println(new String(U));
        }
    }

}
