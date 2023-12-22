import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int cnt = 0;
        for (int i = 0; i < n; i += d * 2 + 1) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
