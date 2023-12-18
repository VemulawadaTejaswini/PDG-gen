import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == 'W') {
                count++;
            }
        }
        int ans = 0;
        for (int i = 0; i < count; i++) {
            if (S.charAt(S.length()-1-i) == 'R') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}