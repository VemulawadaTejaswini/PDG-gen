import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int m = sc.nextInt();
        String t[] = new String[m];
        for (int i = 0; i < m; i++) {
            t[i] = sc.next();
        }
        int yen[] = new int[n];
        for (int i = 0; i < n; i++) {
            String moji = s[i];
            for (int j = 0; j < n; j++) {
                if (s[j].equals(moji)) {
                    yen[i]++;
                }
            }
            for (int j = 0; j < m; j++) {
                if (t[j].equals(moji)) {
                    yen[i]--;
                }
            }
        }
        Arrays.sort(yen);
        System.out.println(Math.max(yen[n - 1], 0));
    }
}