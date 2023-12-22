import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            int mod = (N % 1000) == 0 ? 1000 : (N % 1000);
            System.out.println(1000 - mod);
        }
    }
}