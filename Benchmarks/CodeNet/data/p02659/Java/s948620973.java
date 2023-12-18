import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            long A = Long.parseLong(sc.next());
            long B = (long)(Double.parseDouble(sc.next()) * 100);
            System.out.println(A * B / 100);
        }
    }
}
