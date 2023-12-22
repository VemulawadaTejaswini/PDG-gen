import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            long x = s.nextLong();
            long c = 100;
            int count = 0;
            while (c < x) {
                c += c / 100;
                count++;
            }
            System.out.println(count);
        }
    }
}