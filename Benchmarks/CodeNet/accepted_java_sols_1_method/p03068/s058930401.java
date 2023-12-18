import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int K = Integer.parseInt(sc.next());
        char c = S.charAt(K-1);
        char tmp;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            tmp = S.charAt(i);
            if (tmp == c) {
                sb.append(tmp);
            } else {
                sb.append('*');
            }
        }

        System.out.print(sb);
    }
}