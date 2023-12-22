import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() >= k) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
