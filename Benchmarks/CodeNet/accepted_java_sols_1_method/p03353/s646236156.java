import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();

        Set<String> strs = new TreeSet<>();
        for (int k = 1; k <= K; k++) {
            for (int i = 0; i <= s.length() - k; i++) {
                strs.add(s.substring(i, i + k));
            }
        }

        Iterator<String> it = strs.iterator();
        int i = 1;
        while (it.hasNext()) {
            if (i == K) {
                out.println(it.next());
                return;
            }

            i++;
            it.next();
        }
    }
}