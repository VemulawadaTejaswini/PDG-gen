import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println(x);
            System.exit(0);
        }

        int[] p = new int[102];

        for(int i=0; i<n; i++) {
            p[sc.nextInt()] = 1;
        }

        int diff = 0;
        int comp = 0;
        int ans = 0;
        for(int i=0; i<=101; i++) {
            if(p[i] != 1) {
                diff = Math.abs(x-i);
                if(i == 0) comp = diff;
                if(comp > diff) {
                    comp = diff;
                    ans = i;
                }
            }

        }
        System.out.println(ans);
    }
}
