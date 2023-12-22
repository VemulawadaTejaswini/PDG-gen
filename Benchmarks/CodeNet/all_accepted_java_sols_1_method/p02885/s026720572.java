import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        int C = A - 2 * B;
        if (C < 0)
            C = 0;
        
        PrintWriter out = new PrintWriter(System.out);
        out.println(C);
        out.flush();
    }
}