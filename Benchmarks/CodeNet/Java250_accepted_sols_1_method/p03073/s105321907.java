import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] C = sc.next().toCharArray();
        char before = '0';
        int answer = 0;

        for (int i = 0; i < C.length; i++) {
            if (i == 0) {
                before = C[i];
            } else if (before == '0' && before == C[i]) {
                answer++;
                before = '1';
            } else if (before == '1' && before == C[i]) {
                answer++;
                before = '0';
            } else {
                before = C[i];
            }
        }
        System.out.println(answer);
        sc.close();
    }
}