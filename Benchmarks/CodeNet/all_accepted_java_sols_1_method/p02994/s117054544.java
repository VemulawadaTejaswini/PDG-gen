import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n, l;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += l + i - 1;
        }

        if(l >= 0){
            ans -= l;
        } else if (l + n - 1 <= 0){
            ans -= l + n - 1;
        }
        System.out.println(ans);
        return;
    }
}
