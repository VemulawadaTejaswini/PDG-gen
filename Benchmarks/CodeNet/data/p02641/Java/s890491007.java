import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0;i<N;i++) {
            int p = sc.nextInt();
            set.add(p);
        }

        int ans = X;
        if (set.contains(X)) {
            for (int i=1;i<200;i++) {
                if (!set.contains(X-i)) {
                    ans = X-i;
                    break;
                }
                if (!set.contains(X+i)) {
                    ans = X+i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}