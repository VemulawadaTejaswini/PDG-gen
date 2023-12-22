import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = sc.nextLong();
        for (int i = 1; i < 5; i++) {
            min = Math.min(min, sc.nextLong());
        }
        
        long a = (n-1) / min;
        System.out.println(5+a);
    }
}
