import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        double val = Math.log(n) / Math.log(k);

        if (val % 1 == 0) {
            val++;
        }

        System.out.println((int) Math.ceil(val));
    }
}
