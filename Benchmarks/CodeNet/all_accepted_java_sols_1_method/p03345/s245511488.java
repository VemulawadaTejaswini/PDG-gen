import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextLong();
        System.out.println(k % 2 == 0 ? a - b : b - a);
    }
}