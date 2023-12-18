import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int c=1; c<=n-1; c++) {
            count += di(n-c);
        }
        System.out.print(count);
    }

    static int di(int ab) {
        int k = 1;
        for (int i=2; i<=ab; i++) {
            if (ab % i != 0) continue;
            int c = 0;
            while ((ab % i) == 0) {
                ab = ab / i;
                c += 1;
            }
            k *= c + 1;
        }
        return k;
    }
}
