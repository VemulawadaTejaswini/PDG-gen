import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] nums = new int[26];

        for (int i=0; i<s.length(); i++) {
            nums[(int) s.charAt(i) - 97] += 1;
        }
        for (int i=0; i<26; i++) {
            if (nums[i] == 0) {
                System.out.println((char)(i+97));
                return;
            }
        }
        System.out.println("None");
    }
}

