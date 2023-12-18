/*
Written by Kabir Kanha Arora
@kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        char[] arr1 = s1.toCharArray();
        String s2 = scanner.next();
        char[] arr2 = s2.toCharArray();
        int cnt = 0;
        for (int i = 0; i < s1.length(); ++i) {
            if (arr1[i] != arr2[i])
                cnt++;
        }
        System.out.println(cnt);
    }
}
