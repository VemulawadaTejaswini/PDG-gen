import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
