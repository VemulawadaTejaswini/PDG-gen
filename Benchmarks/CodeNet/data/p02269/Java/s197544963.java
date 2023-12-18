import java.util.*;
import java.lang.*;
import java.util.HashSet;

/**
 * Dictionary
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String pushorpull = sc.next();
            String word = sc.next();

            if (pushorpull.equals("insert")) {
                set.add(word);
            } else {
                if (set.contains(word)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
