
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long a = sc.nextLong();
    static long b = sc.nextLong();
    static long c = sc.nextLong();
    static long k = sc.nextLong();

    public static void main(String[] args) {
        long result = 0;
        long tmp = k - a;
        if (tmp > 0){
            result = a;
            tmp = tmp - b;
            if (tmp > 0){
                result = result - tmp;
            } else {
                result = a;
            }
        } else {
            result = k;
        }
        System.out.println(result);

    }
}
