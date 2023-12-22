import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.next().split("S");
            int max = 0;
            for (String str : s) {
                max = Math.max(str.length(), max);
            }
            System.out.println(max);
        }
    }
}
