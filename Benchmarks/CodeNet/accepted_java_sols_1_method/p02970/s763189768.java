import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;

        if (n % ((d * 2) + 1) == 0) {
            ans = n / ((d * 2) + 1);
        } else {
            ans = n / ((d * 2) + 1) + 1;
        }
        

        System.out.println(ans);

        sc.close();
    }    
}
