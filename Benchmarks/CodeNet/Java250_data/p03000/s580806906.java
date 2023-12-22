import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int cnt = 1;
        
        int od = 0;
        for (int i = 2; i <= n + 1; i++) {
            int nd = od + sc.nextInt();
            if (nd <= x) {
                cnt++;
            }
            od = nd;
        }
        System.out.println(cnt);
    }
}