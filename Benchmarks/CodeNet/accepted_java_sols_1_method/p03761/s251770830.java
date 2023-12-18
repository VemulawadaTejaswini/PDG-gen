import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[][] = new int[N][26];
        List<Character> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                a[i][s.charAt(j) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                min = Math.min(min, a[j][i]);
            }
            for (int j = 0; j < min; j++) {
                ans.add((char)(i + 'a'));
            }
        }
        Collections.sort(ans);
        for (char c : ans) {
            System.out.print(c);
        }
        System.out.println();
    }
}


