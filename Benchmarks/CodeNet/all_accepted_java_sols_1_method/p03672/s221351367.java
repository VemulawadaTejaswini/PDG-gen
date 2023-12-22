import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String set = s.substring(0, s.length() - 1);
        for (int i = set.length(); i > 0; i--) {
            if (set.length() % 2 != 0) {
                set = set.substring(0, set.length() - 1);
                continue;
            } else {
                String first = set.substring(0, set.length() / 2);
                String end = set.substring(set.length() / 2, set.length());
                if (first.equals(end)) {
                    System.out.println(set.length());
                    return;
                }
                set = set.substring(0, set.length() - 1);
            }
        }
    }
}