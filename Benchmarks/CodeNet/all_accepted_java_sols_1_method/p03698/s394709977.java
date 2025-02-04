import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] cs = new int[26];

        Arrays.fill(cs, 0);
        for (int i = 0; i < s.length(); i++) {
            cs[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < cs.length; i++) {
            if (cs[i] > 1) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
