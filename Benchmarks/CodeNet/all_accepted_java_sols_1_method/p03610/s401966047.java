import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) System.out.print(S.charAt(i));
        }
        System.out.println();
    }
}
