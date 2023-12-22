import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();

        if (T.length() - S.length() == 1 && T.startsWith(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}