import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if(s[i-1] != s[i]) c++;
        }
        int ans = Math.min(n-1, n -1 - (c - 2 * k));
        System.out.println(ans);
        sc.close();

    }

}
