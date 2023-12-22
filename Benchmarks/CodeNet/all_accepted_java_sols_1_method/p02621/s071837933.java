import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.close();

        long ret = (long) (a + Math.pow(a, 2) + Math.pow(a, 3));

        System.out.println(ret);
    }
}
