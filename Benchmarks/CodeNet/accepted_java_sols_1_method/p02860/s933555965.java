import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String S = s.next();

        String res = "No";

        if (N % 2 == 0)  {
            if (S.substring(N/2).equals(S.substring(0, N/2))) res = "Yes";
        }

        System.out.println(res);
        s.close();
    }
}