import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        boolean ans = true;
        for (int i = 1; i < 4; i++) {
            if (s[i-1] == s[i]) {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Good" : "Bad");
    }
}