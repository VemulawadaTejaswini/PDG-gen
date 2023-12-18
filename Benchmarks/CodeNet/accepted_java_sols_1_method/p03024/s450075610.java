import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] chars = new char[S.length()];

        for (int i=0; i<S.length(); i++) {
            chars[i] = S.charAt(i);
        }

        int sum = 0;
        for (char c : chars) {
            if (c == 'o') {
                sum++;
            }
        }
        System.out.println((sum + (15 - S.length())) >= 8 ? "YES" : "NO");
    }
}

