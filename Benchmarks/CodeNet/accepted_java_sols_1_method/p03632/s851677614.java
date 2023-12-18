import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int time = 0;

        time = Math.max(0, Math.min(B, D) - Math.max(A, C));

        PrintWriter out = new PrintWriter(System.out);
        out.println(time);

        sc.close();
        out.flush();
    }
}