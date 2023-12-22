import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();
        int one = 0;
        int zero = 0;
        int answer = 0;

        for (char c : S) {
            if (c == '1') {
                one++;
            } else {
                zero++;
            }
            if (one > 0 && zero > 0) {
                answer += 2;
                one--;
                zero--;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}