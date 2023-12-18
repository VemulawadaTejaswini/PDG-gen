
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                out.println("OK");
                out.close();
                return;
            }
        }

        out.println("NG");
        out.close();
    }
}
