import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) break;
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            System.out.println(a + " " + b);
        }
    }
}