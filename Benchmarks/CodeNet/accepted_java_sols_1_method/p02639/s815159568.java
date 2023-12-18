import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            for (int i = 0; i < 5; i++) {
                int in = Integer.parseInt(sc.next());
                if (in == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
