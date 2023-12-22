import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int past = s;
        set.add(past);
        for (int i = 2 ;i<= 1000000 ;i++) {
            int cur;
            if (past % 2 == 0) {
                cur = past / 2;
            } else {
                cur = 3 * past +1;
            }
            if (set.contains(cur)) {
                System.out.println(i);
                return;
            }
            set.add(cur);
            past = cur;
        }
    }
}
