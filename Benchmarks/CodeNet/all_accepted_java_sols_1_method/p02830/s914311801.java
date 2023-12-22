import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();
        char[] T = scanner.next().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++) {
            sb.append(S[i]).append(T[i]);
        }

        System.out.println(sb.toString());
    }
}
