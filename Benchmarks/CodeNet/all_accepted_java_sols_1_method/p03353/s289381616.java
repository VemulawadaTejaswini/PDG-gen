import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = Integer.parseInt(sc.next());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < Math.min(s.length(), k + i); j++) {
                set.add(s.substring(i, j + 1));
            }
        }
        int idx = 0;
        for (String ans : set) {
            if (idx + 1 == k) {
                System.out.println(ans);
                break;
            }
            idx++;
        }
    }
}