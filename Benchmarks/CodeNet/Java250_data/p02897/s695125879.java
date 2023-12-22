import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        double n = inp.nextDouble();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) ans++;
        }
        System.out.println(((double)ans) / n);
    }
}
