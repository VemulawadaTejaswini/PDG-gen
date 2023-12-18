import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long max = 0;

        max = a * c;

        if (a*d >= max) {
            max = a*d;
        }
        if (b*c>=max) {
                max = b*c;
        }
        if (b*d>=max) {
            max = b*d;
        }
            
        System.out.println(max);
        sc.close();
    }
}