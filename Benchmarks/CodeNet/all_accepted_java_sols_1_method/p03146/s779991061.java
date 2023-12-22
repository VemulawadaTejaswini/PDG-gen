import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int tmp = s;
        Set<Integer> set = new HashSet<>();
        set.add(tmp);
        int ans = 0;
        for (int i = 2; i < 1000000; i++) {
            set.add(tmp);
            if (tmp % 2 == 0) {
                tmp /= 2;
            } else {
                tmp = 3 * tmp + 1;
            }
            if (set.contains(tmp)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}