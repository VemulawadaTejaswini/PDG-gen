import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        if (n % 3 == 0) {
            cnt = n / 3;
        } else {
            while (true) {
                if (n < 3) break;
                if (n - 3 >= 3) {
                    n -= 3;
                    cnt++;   
                } else {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}