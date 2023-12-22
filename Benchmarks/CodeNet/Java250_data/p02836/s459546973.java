import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] cs = S.toCharArray();
        int count = 0;
        for (int i = 0; i < S.length() / 2; i++) {
            if (cs[i] != cs[S.length()-1-i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
