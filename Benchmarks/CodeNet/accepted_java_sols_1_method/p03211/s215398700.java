import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        int[] s = new int[n];
        for(int i = 0; i < n; i++) s[i] = Integer.parseInt(""+S.charAt(i));
        int ans = 1000;
        for(int i = 0; i <= n-3; i++) {
            int num = s[i]*100 + s[i+1]*10 + s[i+2];
            ans = Math.min(ans, Math.abs(num-753));
        }
        System.out.println(ans);
    }
}