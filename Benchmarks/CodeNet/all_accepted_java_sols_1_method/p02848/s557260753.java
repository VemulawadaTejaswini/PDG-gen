import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        for (int i = 0; i < S.length; i++) {
            S[i] = (char) ((S[i] + N - 65) % 26 + 65);
        }

        for (char e : S
        ) {
            System.out.print(e);
        }
    }
}
