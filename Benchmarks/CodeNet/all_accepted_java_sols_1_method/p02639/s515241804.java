import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            if (x == 0) {
                System.out.println(i + 1);
            }
        }

    }
}