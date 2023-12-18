import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;
        set.add(s);
        for (int i = 2; i < 1000000; i++) {
            s = s % 2 == 0 ? (s / 2) : (3 * s + 1);
            if (set.contains(s)) {
                result = i;
                break;
            } else {
                set.add(s);
            }
        }
        System.out.println(result);
    }
}
