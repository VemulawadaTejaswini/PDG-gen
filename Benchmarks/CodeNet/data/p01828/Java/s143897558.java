import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        System.out.println(possible(S, S, T) || possible(S, T, S) ? "Yes" : "No");
    }

    static boolean possible(char[] target, char[] s1, char[] s2) {
        int[] pos = {0, 0};
        for (int i = 0; i < target.length; i++) {
            char[] s = i % 2 == 0 ? s1 : s2;
            while (pos[i % 2] < s.length && s[pos[i % 2]] != target[i]) {
                pos[i % 2]++;
            }
            if (pos[i % 2] == s.length || s[pos[i % 2]] != target[i]) {
                return false;
            }
            pos[i % 2]++;
        }
        return true;
    }
}