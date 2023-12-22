import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] alp = new int[26];
        boolean bre  = false;
        for (int i = 0; i < s.length(); i++) {
            if (alp[s.charAt(i) - 'a'] == 1) {
                bre = true;
                break;
            } else {
                alp[s.charAt(i) - 'a'] = 1;
            }
        }
        if (bre) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}