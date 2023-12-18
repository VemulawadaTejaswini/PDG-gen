import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            int X = Integer.parseInt(sc.next());
            int T = Integer.parseInt(sc.next());

            // solve
            System.out.println(T * ((N / X) + ((N % X != 0) ? 1 : 0)));
        }
    }
}