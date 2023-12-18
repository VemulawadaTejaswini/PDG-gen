import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        Arrays.setAll(p, i -> sc.nextInt());
        sc.close();
        
        int resa = x;
        for (int i = x; i <= 100; i++) {
            boolean ok = false;
            for (int j = 0; j < n; j++) {
                if (p[j] == i) ok = true;
            }   
            if (ok) continue;
            else {
                resa = i;
                break;
            }
        }
        int resb = x;
        for (int i = x; i >= 0; i--) {
            boolean ok = false;
            for (int j = 0; j < n; j++) {
                if (p[j] == i) ok = true;
            }
            if (ok) continue;
            else {
                resb = i;
                break;
            }
        }

        int res = x;
        if(Math.abs(x-resa) < Math.abs(x-resb)) {
            res = resa;
        } else {
            res = resb;
        }
        System.out.println(res);
        
    }
}

