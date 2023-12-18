import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long C = N / 500;
        long D = (N-500*C)/5;
        System.out.println(1000 * C + 5 * D);
    }
}
