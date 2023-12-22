import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        Set<String> ts = new TreeSet<>();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j > i + k) {
                    break;
                } else {
                    ts.add(s.substring(i, j));
                }
            }
        }

        Iterator<String> it = ts.iterator();
        int cnt = 1;

        while (it.hasNext()) {
            if (cnt == k) {
                System.out.println(it.next());
                return;
            }
            it.next();
            cnt++;
        }
    }
}