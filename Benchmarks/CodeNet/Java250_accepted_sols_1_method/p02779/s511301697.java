import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a[] = new int[n];
        Set<Integer> sa = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
            sa.add(a[i]);
        }
        String ans = (sa.size() == a.length ? "YES" : "NO");
        System.out.println(ans);
    }
}