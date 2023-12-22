import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        boolean ans = false;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                int t = i * j + (n-i)*(m-j);
                if(t == k) ans = true;
                if(ans)break;
            }
            if(ans)break;
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
