import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            int K = in.nextInt();

            TreeSet<String> set = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int end = i + 1; end <= i + 5 && end <= s.length(); end++) {
                    set.add(s.substring(i, end));
                }
            }
//            Utils.debug(set);
            int k = 0;
            for (String string : set) {
                if (++k == K) {
                    System.out.println(string);
                    return;
                }
            }

        }
    }
}
