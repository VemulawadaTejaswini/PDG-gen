import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> s = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String t = sc.next();
            s.remove(t);
        }
        s.sort(null);

        int max = 0;
        if (s.size() > 0) {
            int cnt = 1;
            for (int i = 1; i < s.size(); i++) {
                if (s.get(i).equals(s.get(i-1))) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}