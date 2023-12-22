

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        for (int i=0; i<3; i++){
            if (a % 10 == 1)
                ans++;
            a /= 10;
        }
        System.out.println(ans);
        }
}