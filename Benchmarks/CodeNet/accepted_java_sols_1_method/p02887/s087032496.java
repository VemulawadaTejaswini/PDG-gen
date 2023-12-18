import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 1;

        String base = s.substring(0, 1);

        for (int i = 1; i < n; i++) {
            if (!base.equals(s.substring(i, i+1))) {
                ans++;
                base = s.substring(i, i+1);
            }
        }

        System.out.println(ans);

        sc.close();
    }    
}
