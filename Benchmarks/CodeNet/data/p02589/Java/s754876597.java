import java.util.*;
public class Main {

    /**
     * @param n int整型
     * @param m int整型
     * @param a int整型一维数组
     * @return int整型
     */
    public static int count(int n, String[] s) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (convert1to2(s[i], s[j])) ret++;
            }
        }
        return ret;
    }

    public static boolean convert1to2(String a, String b) {
        int m1 = a.length(), m2 = b.length();
        if (m1 == m2) return false;
        if (b.length() == 1) {
            return a.indexOf(b) != -1;
        }

        if (a.substring(m1 - m2, m1).equals(b)) return true;
        if        (a.substring(m1 - m2 + 1, m1).equals(b.substring(1, m2))
                        && a.indexOf(b.substring(0, 1)) <= m1 - m2 && a.indexOf(b.substring(0, 1)) >= 0)
            return true;

        else
            return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[0] = sc.next();
        }
        Arrays.sort(s, (s1, s2) -> s2.length() - s1.length());                
        sc.close();

        System.out.println(count(n, s));
    }
}