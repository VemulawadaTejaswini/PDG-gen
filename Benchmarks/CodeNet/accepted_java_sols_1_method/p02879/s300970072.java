import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        if (A<10 && B<10) {
            System.out.println(A*B);
        } else {
            System.out.println("-1");
        }
    }
}
