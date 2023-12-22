import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int slen = s.length();
        char c[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < (slen / 2); i++) {
            if (c[i] != c[(slen - 1) - i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
