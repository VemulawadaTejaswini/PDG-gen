import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();

        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));

        if (max - min <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}