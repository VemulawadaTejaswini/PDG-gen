import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, t, s;
        d = sc.nextInt();
        t = sc.nextInt();
        s = sc.nextInt();
        if (d > t * s) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        sc.close();
    }
}
