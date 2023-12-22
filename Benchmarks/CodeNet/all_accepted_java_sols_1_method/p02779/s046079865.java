import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = true;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (set.contains(A)) {
                ans = false;
                break;
            }
            set.add(A);
        }
        System.out.println(ans ? "YES" : "NO");
    }
}

