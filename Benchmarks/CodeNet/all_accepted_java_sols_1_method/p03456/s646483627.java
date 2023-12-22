import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int target = Integer.valueOf(a+b);
        boolean isSquare = false;

        for (int i = 1; i <= 100100; i++) {
            if (target == i*i) {
                isSquare = true;
                break;
            }
        }

        if (isSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
