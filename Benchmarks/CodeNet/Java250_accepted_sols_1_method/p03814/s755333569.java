

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s = sc.next().toCharArray();
            int left = 0;
            while (s[left] != 'A') {
                left++;
            }

            int right = s.length - 1;
            while (s[right] != 'Z') {
                right--;
            }

            System.out.println(right - left + 1);
        }
    }
}
