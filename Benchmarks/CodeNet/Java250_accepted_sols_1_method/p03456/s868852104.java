import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        boolean bre = false;
        for (int i = 0; i < c / 2; i++) {
            if (i * i == c) {
                bre = true;
                break;
            }
        }
        if (bre) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
