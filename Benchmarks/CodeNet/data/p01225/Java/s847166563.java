import java.util.*;

public class Main{
    static int[] n = new int[9];
    static int[][] perms = new int[362880][9];

    public static void main(String[] args) {
        setPermutation();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t=0; t<T; t++) {
            for (int i=0; i<9; i++) n[i] = sc.nextInt();
            for (int i=0; i<9; i++) {
                char c = sc.next().toCharArray()[0];
                if (c == 'G') n[i] += 10;
                else if (c == 'B') n[i] += 20;
            }

            Arrays.sort(n);

            boolean flg = true;
            for (int[] perm : perms) {
                if (judge(perm)) {
                    System.out.println(1);
                    flg = false;
                    break;
                }
            }
            if (flg) System.out.println(0);
        }
    }

    static boolean judge(int[] p) {
        return isSet(n[p[0]], n[p[1]], n[p[2]])
                && isSet(n[p[3]], n[p[4]], n[p[5]])
                && isSet(n[p[6]], n[p[7]], n[p[8]]);
    }

    static boolean isSet(int a, int b, int c) {
        if (a == b && b == c) return true;
        else if (a+1 == b && b+1 == c) return true;
        else return false;
    }

    static void setPermutation() {
        final int[] HASH_BASE = {40320, 5040, 720, 120, 24, 6, 2, 1, 1};

        int n;
        List<Integer> list;
        for (int i=0; i<362880; i++) {
            n = i;
            list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
            for (int j=0; j<9; j++) {
                perms[i][j] = list.get(n / HASH_BASE[j]);
                list.remove(n / HASH_BASE[j]);
                n %= HASH_BASE[j];
            }
        }
    }
}