import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC153D - Caracal vs Monster

        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

        if (h == 1) {
            System.out.println(1);
            return;
        }
        
        long x = h;
        int cnt = 0;
        while(true) {
            x /=2;
            cnt++;
            if (x == 1) break;
        }
        
        long ans = 2;
        for (int i = 0; i < cnt; i++) {
            ans *= 2;
        }
        
        if (cnt > 0) ans--;

        System.out.println(ans);
    }

}