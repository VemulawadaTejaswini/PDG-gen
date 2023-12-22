import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        boolean ok = false;
        for (int a = 0; a <= 100; a++) {
            int b = x-a;
            if (b >= 0) {
                if (2*a+4*b == y) {
                    ok = true;
                }
            }
        }

        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

