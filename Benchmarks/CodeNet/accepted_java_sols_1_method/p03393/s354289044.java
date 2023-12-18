import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println(-1);
        } else {
            String ans = "";
            if (s.length() == 26) {
                char min = 'z';
                for (int i = 25; i >= 1; i--) {
                    if (s.charAt(i) > s.charAt(i-1)) {
                        for (int j = i; j < 26; j++) {
                            if (s.charAt(j) < min && s.charAt(j) > s.charAt(i-1)) {
                                min = s.charAt(j);
                            }
                        }
                        for (int k = 0; k < i-1; k++) {
                            ans += s.charAt(k);
                        }
                        break;
                    }
                }
                System.out.println(ans+min);
            } else {
                char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                int[] used = new int[s.length()];
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if (s.charAt(i) == alpha[j]) {
                            used[i] = j;
                        }
                    }
                }
                int minint = 0;
                char min = 'z';
                for (int i = 0; i < 26; i++) {
                    boolean flag = true;
                    for (int j = 0; j < used.length; j++) {
                        if (i == used[j]) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        if (alpha[i] < min) {
                            min = alpha[i];
                            minint = i;
                        }
                    }
                }
                System.out.println(s + alpha[minint]);
            }
        }
    }

}
