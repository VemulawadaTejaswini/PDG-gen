import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i < n; i++) {
            int now = n/i;
            if (n%i==0) now--;
            count += now;
            // System.out.println(i + " " + now);
        }
        System.out.println(count);
        
        // a*b+c=n
        
        // n=100
        // 1,1,99
        // 1,2,98
        // 1,99,1 1...100-1
        // 2,1,98
        // 2,49,2 2...100/2-1
        // 3,33,1
        // 100
        
        // for (int a = 1; a <= )
    }
}
