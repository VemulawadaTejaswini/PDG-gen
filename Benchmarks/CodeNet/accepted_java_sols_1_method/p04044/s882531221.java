import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        String[] ss = new String[n];
        for (int i = 0;i < n;i++) {
            ss[i] = s.next();
        }

        Arrays.sort(ss,(s1,s2) -> {
            for (int i = 0;i < m;i++) {
                if (s1.charAt(i) == s2.charAt(i)) continue;
                return s1.charAt(i) - s2.charAt(i);
            }
            return 0;
        });
        StringBuilder sb = new StringBuilder();
        for (String si:ss) {
            sb.append(si);
        }
        System.out.println(sb.toString());
    }
}
