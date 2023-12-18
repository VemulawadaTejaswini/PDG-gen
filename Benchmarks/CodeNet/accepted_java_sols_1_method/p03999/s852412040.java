import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc     = new Scanner(System.in);
        char[]  S      = sc.next().toCharArray();
        long    result = 0L;

        if (S.length == 1) {
            System.out.println(S[0]);
            return;
        }

        for (int bit = 0; bit < (1 << (S.length - 1)); ++bit) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < (S.length); ++i) {
                sb.append(S[i]);
                if ((bit & (1 << i)) > 0) {
                    sb.append("+");
                }
            }
            String[] term = sb.toString().split("\\+", 0);
            result += Arrays.stream(term).mapToLong(Long::parseLong).sum();
        }

        System.out.println(result);
    }
}