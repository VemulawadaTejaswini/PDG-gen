import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        String ans = "NG";
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                ans = "OK";
                break;
            }
        }
        
        System.out.println(ans);
    }
}