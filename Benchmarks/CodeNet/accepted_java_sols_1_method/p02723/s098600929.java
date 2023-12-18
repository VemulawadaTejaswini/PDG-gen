import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        String result = "";

        if (S.charAt(2) == S.charAt(3)) {
            count++;
        }

        if (S.charAt(4) == S.charAt(5)) {
            count++;
        }

        if (count == 2) {
            result = "Yes";
        } else {
            result = "No";
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        sc.close();
        out.flush();
    }
}