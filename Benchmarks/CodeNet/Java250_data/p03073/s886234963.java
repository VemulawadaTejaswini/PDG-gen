import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> str = Arrays.asList(sc.next().split(""));
        Integer ans1 = 0;
        Integer ans2 = 0;
        for (int i = 0; i < str.size(); i++) {
            if (i % 2 == 0) {
                // 101010...
                if ("0".equals(str.get(i))) {
                    ans1++;
                }
                // 010101...
                if ("1".equals(str.get(i))) {
                    ans2++;
                }

            } else {
                // 101010...
                if ("1".equals(str.get(i))) {
                    ans1++;
                }
                // 010101...
                if ("0".equals(str.get(i))) {
                    ans2++;
                }

            }
        }
        System.out.println(Math.min(ans1, ans2));

    }
}