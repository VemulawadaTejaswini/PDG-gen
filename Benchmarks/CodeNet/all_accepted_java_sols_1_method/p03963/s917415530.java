import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long sum = k;
        for (int i = 1; i < n; i++) {
            sum *= (k-1);
        }
        System.out.println(sum);
    }
}
