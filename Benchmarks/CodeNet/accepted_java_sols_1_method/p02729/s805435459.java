import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 1;
        int ans2 = 1;
        for (int i = a; i > a - 2; i--) {
            ans *= i;
        }
        ans /= 2;
        for (int i = b; i > b - 2; i--) {
            ans2 *= i;
        }
        ans2 /= 2;
        System.out.println(ans + ans2);
    }
}
