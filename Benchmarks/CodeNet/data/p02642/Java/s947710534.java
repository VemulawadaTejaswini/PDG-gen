import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) { continue; }
                if (list.get(i) % list.get(j) == 0) {
                    break;
                } else {
                    ++count;
                }
                if (count == n - 1) { ++ans; }
            }
        }

        System.out.println(ans);
    }
}
