import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        S = S.replace("ABC", "-");
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '-') {
                count++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        sc.close();
        out.flush();
    }
}