import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        if (str.contains("RRR")) {
            ans = 3;
        } else if (str.contains("RR")) {
            ans = 2;
        } else if (str.contains("SSS")) {
            ans = 0;
        } else {
            ans = 1;
        }
        System.out.println(ans);
    }
}
