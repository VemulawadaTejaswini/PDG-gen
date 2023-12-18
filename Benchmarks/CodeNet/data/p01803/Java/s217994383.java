import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            String[] codes = new String[N];
            for (int i = 0; i < N; i++) {
                codes[i] = code(sc.next());
            }
            int ans= -1;
            for (int i = 1; i <= 50 ; i++) {
                HashSet<String> set = new HashSet<>();
                for (int j = 0; j < N; j++) {
                    set.add(codes[j].substring(0, Math.min(i, codes[j].length())));
                }
                if (set.size() == N) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }

    }

    static String code(String name) {
        String ret = "" + name.charAt(0);
        for (int i = 1; i < name.length(); i++) {
            if ("aiueo".indexOf(name.charAt(i - 1)) >= 0) ret += name.charAt(i);
        }
        return ret;
    }


}