import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int ans = 0;

        for (int i = 0; i < N-2; i++) {
            if (str.substring(i, i+3).equals("ABC")) {
                i = i + 2;
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }    
}
