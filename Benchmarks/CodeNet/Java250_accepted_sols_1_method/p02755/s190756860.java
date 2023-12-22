import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 0; i < 10e4; i++) {
            int A2 = i * 8/100;
            int B2 = i * 10/100;
            if (A2==A && B2==B) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println("-1");
    }
}
