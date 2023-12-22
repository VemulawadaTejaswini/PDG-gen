import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }

        Arrays.sort(strs);
        String ans = "";
        for (String str : strs) {
            ans += str;
        }
        System.out.println(ans);
    }
}