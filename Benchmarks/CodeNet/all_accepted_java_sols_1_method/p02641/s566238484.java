import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int ans = 0;
        for (int i = 0; i <= 100; i++) {
            int l = x-i, r = x+i;
            if(!set.contains(l)){
                ans = l;break;
            }
            if(!set.contains(r)){
                ans = r; break;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
