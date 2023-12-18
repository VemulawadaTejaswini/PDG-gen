import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = "";
        int[] cnt = new int[26];

        while (scan.hasNext()) {
            string = scan.nextLine();
            string = string.toLowerCase();
            char[] c = string.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if ('a' <= c[i] && c[i] <= 'z') {
                    cnt[c[i] - 'a']++;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(((char)(i + 'a')) + " :" + cnt[i]);
        }
    }
}