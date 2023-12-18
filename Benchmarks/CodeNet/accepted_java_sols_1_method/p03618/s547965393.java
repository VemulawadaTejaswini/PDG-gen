import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int[] cnt = new int[26];
        long ans = (long)(A.length())*(A.length()-1)/2+1;
        for (int i = 0; i < A.length(); i++) {
            int c = A.charAt(i)-'a';
            ans -= cnt[c];
            cnt[c]++;
        }
        System.out.println(ans);
    }
}
