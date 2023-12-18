import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int max = 0, cnt = 0;
            for(char c : sc.next().toCharArray()) {
                if (c == 'R') {
                    cnt++;
                } else {
                    max = Math.max(cnt, max);
                    cnt = 0;
                }
            }
            System.out.println(max);
        }
    }
}