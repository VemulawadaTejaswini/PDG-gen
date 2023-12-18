import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = 0;
            if(n == 0 && x == 0) break;
            for(int i = 1; i <= n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    for(int k = j + 1; k <= n; k++) {
                        if(i + j + k == x) c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}