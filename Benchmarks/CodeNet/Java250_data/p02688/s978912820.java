import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int ni = 0;
        Set<Integer> a = new TreeSet<Integer>();
        for (int i = 0; i < k; i++) {
            ni = inp.nextInt();
            for (int j = 0; j < ni; j++) {
                a.add(inp.nextInt());
            }
        }
        int tmp[] = new int[n];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!(a.contains(i))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}