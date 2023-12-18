import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] ss = new int[26];
        for (int i = 0; i < s.length; i++) {
            ss[s[i] - 'a']++;
        }
        for (int i = 0; i < ss.length; i++) {
            if(ss[i] == 0) {
                char c = (char) ('a' + i);
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }
}