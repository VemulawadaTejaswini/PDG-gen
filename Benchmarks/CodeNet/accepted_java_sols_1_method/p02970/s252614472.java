import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println((int)Math.ceil(n / (2 * d + 1)));
    }
}
