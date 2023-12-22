import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final String S = scan.next();
        final String T = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
