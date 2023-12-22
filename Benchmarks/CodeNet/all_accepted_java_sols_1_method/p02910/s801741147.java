import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String steps = sc.next();
        sc.close();

        boolean judge = true;
        for (int i = 0; i < steps.length(); i++) {
            char step = steps.charAt(i);
            if (i % 2 == 0) {
                if (step == 'L') {
                    judge = false;
                    break;
                }
            } else {
                if (step == 'R') {
                    judge = false;
                    break;
                }
            }
        }

        if (judge) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}