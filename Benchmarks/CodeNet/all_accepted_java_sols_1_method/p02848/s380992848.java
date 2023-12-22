import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        for (int i=0;i<c.length;i++) {
            if (c[i]<=90-N) {
                c[i] += N;
            } else {
                c[i] += N-26;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<c.length;i++) {
            sb.append(c[i]);
        }
        System.out.println(sb);
    }
}