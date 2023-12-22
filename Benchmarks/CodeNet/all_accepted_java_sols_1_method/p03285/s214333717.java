import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cake = 4;
        int donuts = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                int total = cake * i + donuts * j;
                if (total == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
