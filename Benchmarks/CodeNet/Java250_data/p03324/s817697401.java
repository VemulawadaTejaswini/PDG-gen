import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int res = (int) Math.pow(100, d);

        if (n < 100) {
            System.out.println(res * n);
        } else {
            System.out.println(res * 101);
        }
    }
}