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
            long stand_r = 0;
            long stand_c = 0;
            long sit_r = 0;
            long sit_c = 0;
            long ans = 0;
            for (int i = qs.length - 1; i >= 0; i--) {
                if (set.contains(qs[i].toString()))
                    continue;
                set.add(qs[i].toString());
                if (qs[i].a == 0) {
                    if (qs[i].o == 0) {
                       sit_r++;
                    } else {
                       stand_r++;
                        ans += r;
                        ans -= sit_c;
                        ans -= stand_c;
                    }

                } else {
                    if (qs[i].o == 0) {
                        sit_c++;
                    } else {
                        stand_c++;;
                        ans += c;
                        ans -= sit_r;
                        ans -= stand_r;
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
        return a + "," + b;
    }
}