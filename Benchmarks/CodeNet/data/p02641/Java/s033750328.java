import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();


        if (n == 0) {
            System.out.println(x);
            return;
        }

        Set<Integer> p = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            p.add(sc.nextInt());
        }

        if (!p.contains(x)) {
            System.out.println(x);
            return;
        }


        int result = Integer.MAX_VALUE;
        int i = 0;
        while (i <= n) {
            if (!p.contains(x - i)) {
                result = x - i;
                break;
            }

            if (!p.contains(x + i)) {
                result = x + i;
                break;
            }

            i++;
        }

        System.out.println(result);
    }
}
