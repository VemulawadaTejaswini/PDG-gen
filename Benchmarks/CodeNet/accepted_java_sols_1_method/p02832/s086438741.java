import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int target = 1;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() != target) {
                count++;
            } else {
                target++;
            }
        }

        if (count == n) {
            count = -1;
        }

        System.out.println(count);
    }
}
