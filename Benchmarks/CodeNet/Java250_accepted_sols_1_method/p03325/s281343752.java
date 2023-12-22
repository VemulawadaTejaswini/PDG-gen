import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long count = 0;
        while (n-- > 0) {
            long num = sc.nextLong();
            
            while (num % 2 == 0) {
                num /= 2;
                count++;
            }
        }
        System.out.println(count);
    }
}
