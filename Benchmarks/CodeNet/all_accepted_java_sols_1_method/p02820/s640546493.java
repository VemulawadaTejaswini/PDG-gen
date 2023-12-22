import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String tStr = sc.next();

        char[] t = tStr.toCharArray();
        // System.out.println(Arrays.toString(t));

        long ans = 0;
        boolean[] hasWon = new boolean[n];
        for(int i = 0; i < n; ++i) {
            if(i < k || t[i] != t[i - k]) {
                ans += (t[i] == 'r') ? p : (t[i] == 's') ? r : s;
                hasWon[i] = true;
            } else if(hasWon[i - k]) {
                ans += 0;
                hasWon[i] = false;
            } else {
                ans += (t[i] == 'r') ? p : (t[i] == 's') ? r : s;
                hasWon[i] = true;
            }
        }
        System.out.println(ans);
    }
}
