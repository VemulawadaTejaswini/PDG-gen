import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        while (a > 0 && c > 0) {
            if (count % 2 == 0) {
                c -= b;
            } else {
                a -= d;
            }
            count++;
        }
        if (c <= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
