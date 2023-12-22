import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int X = Integer.parseInt(sc.next());
        sc.close();

        int d = 0;
        boolean b = true;
        if (X==2) {
            System.out.println(2);
            return;
        } else if (X%2==0) d = 1;
        for (int i=X+d; ; i+=2) {
            b = true;
            for (int j = 3; j<X+d; j+=2) {
                if (i%j==0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
                return;
            }
        }
    }
}