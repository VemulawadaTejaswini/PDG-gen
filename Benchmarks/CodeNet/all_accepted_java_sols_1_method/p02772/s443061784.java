import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        String ans = "APPROVED";
        for(int i = 0; i < n; ++i) {
            int tmp = Integer.parseInt(sc.next());
            if(tmp % 2 == 0 && tmp % 3 != 0 && tmp % 5 != 0) {
                ans = "DENIED";
            }
        }
        System.out.println(ans);
    }
}
