import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[26];
        Arrays.fill(a, 0);
        while (sc.hasNextLine()) {
            for (char c : sc.nextLine().toLowerCase().toCharArray()) {
                if ('a' <= c && c <= 'z') {
                    a[c-'a'] += 1;
                }
            }
        }

        char c = 'a';
        for (int n : a) System.out.println(c++ + " : " + n);
    }
}