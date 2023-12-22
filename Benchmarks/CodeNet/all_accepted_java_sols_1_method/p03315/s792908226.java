import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '+':
                    score += 1;
                    break;
                case '-':
                    score -= 1;
                    break;
                default:
                    break;
            }
        }

        System.out.println(score);
    }
}
