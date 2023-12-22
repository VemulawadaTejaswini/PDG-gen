import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        m--;
        while (m-- > 0) {
            min = Math.max(min, sc.nextInt());
            max = Math.min(max, sc.nextInt());
        }
        
        if (min > max) {
            System.out.println(0);
            return;
        }
        System.out.println(max - min + 1);
    }
}
