import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f=false;
        for (;;) {
            int n = sc.nextInt();
            if(n==0)break;
            if(f) {
                System.out.println("");
            }
            f=true;
            T[] t = new T[n];
            for (int i = 0; i < n; i++) {
                t[i] = new T(sc.next(), sc.nextInt() * 3 + sc.nextInt() * 0 + sc.nextInt());
            }
            Arrays.sort(t, new Comparator<T>() {
                public int compare(T a, T b) {
                    return b.s - a.s ;
                }
            });
            for(T a:t) {
                System.out.println(a.t+","+a.s);
            }
        }
    }
}
class T {
    String t;
    int s;

    T(String t, int s) {
        this.t = t;
        this.s = s;
    }
}


