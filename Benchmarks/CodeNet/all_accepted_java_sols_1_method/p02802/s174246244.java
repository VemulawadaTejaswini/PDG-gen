import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
            set.add(p[i]);
        }
        if(m == 0) {
            System.out.println("0 0");
            return;
        }
        int size = Collections.max(set);
        boolean[] tmp = new boolean[size + 1];
        int[] tmp2 = new int[size + 1];
        int ac = 0;
        int wa = 0;
        for (int i = 0; i < m; i++) {
            int tmp3 = p[i];
            if(!tmp[tmp3]) {
                if(s[i].equals("WA")) {
                    tmp2[tmp3]++;
                } else {
                    ac++;
                    wa += tmp2[tmp3];
                    tmp[tmp3] = true;
                }
            }
        }
        System.out.println(ac + " " + wa);
    }
}