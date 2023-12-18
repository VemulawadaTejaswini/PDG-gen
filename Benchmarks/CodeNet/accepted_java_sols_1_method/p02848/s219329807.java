import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        PrintWriter pw = new PrintWriter(System.out);
        for (char c : S.toCharArray()) {
            int i = c+N;
            pw.print((char) (i > 90 ? i-26 : i));
        }
        pw.println();
        pw.flush();
    }
}
