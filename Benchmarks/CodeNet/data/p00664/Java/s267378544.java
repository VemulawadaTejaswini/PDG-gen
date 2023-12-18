import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            if ((r | c | q) == 0)
                break;
            Query qs[] = new Query[q];
            for (int i = 0; i < q; i++) {
                qs[i] = new Query(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Set<String> set = new HashSet<String>();
            Set<Integer> stand_r = new HashSet<Integer>();
            Set<Integer> sit_r = new HashSet<Integer>();
            Set<Integer> stand_c = new HashSet<Integer>();
            Set<Integer> sit_c = new HashSet<Integer>();
            int ans = 0;
            for (int i = qs.length - 1; i >= 0; i--) {
                if (set.contains(qs[i].toString()))
                    continue;
                set.add(qs[i].toString());
                if (qs[i].a == 0) {
                    if (qs[i].o == 0) {
                        sit_r.add(qs[i].b);
                    } else {
                        stand_r.add(qs[i].b);
                        ans += r;
                        ans -= sit_c.size();
                        ans -=stand_c.size();
                    }

                } else {
                    if (qs[i].o == 0) {
                        sit_c.add(qs[i].b);
                    } else {
                        stand_c.add(qs[i].b);
                        ans += c;
                        ans -= sit_r.size();
                        ans -= stand_r.size();
                    }
                }
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class Query {
    int a;
    int b;
    int o;

    Query(int a, int b, int o) {
        this.a = a;
        this.b = b;
        this.o = o;
    }

    public String toString() {
        return a + " " + b;
    }
}