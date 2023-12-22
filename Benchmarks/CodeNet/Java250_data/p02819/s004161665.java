import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        Boolean result = false;
        PrintWriter out = new PrintWriter(System.out);

        while (true) {
            result = isSosu(X);

            if (!result) {
                X++;
            } else {
                break;
            }
        }

        out.println(X);

        sc.close();
        out.flush();
    }

    private static Boolean isSosu(int X) {
        if (X == 2)
            return true;
        if (X < 2 || X % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt((double) X); i += 2) {
            if (X % i == 0) {
                return false;
            }
        }
        return true;
    }
}