import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((int)Math.ceil(n / (2.0 * d + 1.0)));
        sc.close();

    }

}
