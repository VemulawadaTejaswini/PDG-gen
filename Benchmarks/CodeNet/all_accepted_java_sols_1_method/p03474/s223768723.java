import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        boolean isCorrect = true;
        if (s.charAt(a) != '-') isCorrect = false;

        for (int i = 0; i < a + b; i++) {
            if (!isCorrect) break;
            if (i == a) continue;
            if (s.charAt(i) == '-') isCorrect = false;
        }

        if (isCorrect) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
