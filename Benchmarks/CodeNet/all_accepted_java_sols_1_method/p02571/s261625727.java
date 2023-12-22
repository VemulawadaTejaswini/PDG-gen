import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int max = 0;
        for (int i = 0; i < S.length()-T.length()+1; i++) {
            String now = S.substring(i, i+T.length());
            int count = 0;
            for (int j = 0; j < T.length(); j++) {
                if (T.charAt(j) == now.charAt(j)) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(T.length()-max);
    }
}
