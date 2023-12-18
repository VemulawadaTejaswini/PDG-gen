
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
           int n = scanner.nextInt();

           Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                String s = Integer.toString(a);
                set.add(s);
            }
            int m = scanner.nextInt();
            boolean flag = true;
            for (int i = 0; i < m; i++) {
                int b = scanner.nextInt();
                String s1 = Integer.toString(b);
                if (!set.contains(s1)){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag?1:0);

        } catch (Exception e) {

        } finally {

        }

    }

}


