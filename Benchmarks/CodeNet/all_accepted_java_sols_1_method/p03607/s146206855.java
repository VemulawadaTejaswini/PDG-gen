import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (set.contains(temp)) {
                set.remove(temp);
            } else {
                set.add(temp);
            }
        }
        System.out.println(set.size());
    }
}
