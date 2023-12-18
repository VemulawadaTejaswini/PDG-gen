import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 1;
        int sum = 0;
        
        while (n-- > 0) {
            int num = sc.nextInt();
            sum += num;
            if (sum <= x) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
