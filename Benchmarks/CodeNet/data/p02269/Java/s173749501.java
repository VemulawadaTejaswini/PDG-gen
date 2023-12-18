import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        try (Scanner sc = new Scanner(System.in)) {
            int n = 1;
            int j = 0;
            n = sc.nextInt();
            String str;
            String value;
            boolean[] ans = new boolean[n];
            int ansi = 0;
            for (int i = 0; i < n; i++) {
                str = sc.next();
                value = sc.next();
                if (str.equals("find")) {
                    if (i == 0) {
                        ans[ansi] = false;
                        ansi++;
                    }else if (set.contains(value)) {
                        ans[ansi] = true;
                        ansi++;
                    } else {
                        ans[ansi] = false;
                        ansi++;
                    }
                }else {
                    set.add(value);
                }
            }
            for (int i = 0; i < ansi; i++) {
                if (ans[i])
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            sc.close();
            return;
        }
    }
}
