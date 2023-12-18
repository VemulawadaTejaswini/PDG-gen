import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> aList = new ArrayList<>();
        long ans = 0;
        for (int i=1;i<=n;i++) {
            aList.add(sc.nextLong());
        }
        Collections.sort(aList);

        ans += aList.get(n-1);
        for (int i=(n-2);i>=((n+1)/2);i--) {
            long aa = aList.get(i) * 2;
            ans += aa;
        }
        if (n%2 == 1) {
            ans += aList.get((n+1)/2 - 1);

        }
        System.out.println(ans);
    }
}
