import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int result = 0;

        result = a + (a * a) + (a * a * a);

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);

        sc.close();
        out.flush();
    }
}