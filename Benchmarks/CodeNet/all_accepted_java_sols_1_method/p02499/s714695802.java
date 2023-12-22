import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = "";
        while (sc.hasNext()) {
            S += sc.next();
        }
        char[] s = S.toLowerCase().toCharArray();
        int[] c = new int[26];

        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z') {
                c[s[i] - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(String.format("%s : %d", (char) ('a' + i), c[i]));
        }
    }
}