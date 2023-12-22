import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        n -= k;
        count++;
        count += (n + k - 2) / (k-1);
        System.out.println(count);
    }
}
