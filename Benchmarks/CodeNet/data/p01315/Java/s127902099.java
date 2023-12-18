import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            ;
            if (N == 0)
                break;
            P[] p = new P[N];
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                int buy = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = sc.nextInt();
                int sell = sc.nextInt();
                int m = sc.nextInt();
                int leaf = a + b + c;
                int fruit = d + e;
                sell *= f;
                double eff = 0;
                if (m == 1) {
                    eff = (0.0 + sell - buy) / (0.0 + leaf + fruit);
                } else {
                    eff = (sell * m - buy + 0.0) / (0.0 + leaf + fruit * m);
                }
                p[i] = new P();
                p[i].name = s;
                p[i].eff = eff;
            }
            Arrays.sort(p, new Comparator<P>() {
                @Override
                public int compare(P o1, P o2) {
                    double e = 1e-9;
                    if(Math.abs(o1.eff-o2.eff)<e){
                        return o1.name.compareTo(o2.name);
                    }
                    return -Double.compare(o1.eff, o2.eff);
                }
            });
            for (int i = 0; i < p.length; i++) {
                System.out.println(p[i].name);
            }
            System.out.println("#");
        }
    }

    static class P {
        String name;
        double eff;
    }
}