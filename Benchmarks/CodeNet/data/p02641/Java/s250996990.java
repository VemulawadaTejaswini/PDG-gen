import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        for (int i=0; i<n; i++) {
            p[i] = sc.nextInt() - x;
        }
        Arrays.sort(p, (a, b) -> {
            int sub = Math.abs(a) - Math.abs(b);
            return sub == 0 ? a : sub;
        });
        int sub = 0;
        if (n != 0) {
            if (p[0] == 0) {
                sub++;
                for (int i=1; i<n; i=i+2) {
                    if (p[i] != -1 * sub) {
                        sub = -1 * sub;
                        break;
                    }
                    if (i+1 >= n || p[i+1] != sub){
                        break;
                    }
                    sub++;
                }
            }
        }
        System.out.println(x + sub);
    }
}