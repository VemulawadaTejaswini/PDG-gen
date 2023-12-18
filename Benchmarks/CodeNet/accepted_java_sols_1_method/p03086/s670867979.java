import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String S = sc.next();
        int len = 0;
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'A' || c == 'T' || c == 'G' || c == 'C') {
                len++;
            } else {
                len = 0;
            }
            max = Math.max(max, len);
        }
        System.out.println(max);
    }
}
