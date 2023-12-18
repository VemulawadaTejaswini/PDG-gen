import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        
        for(int i = 1; i <= n; i++){
            int sum = i%10 + (i/10)%10 + (i/100)%10 + (i/1000)%10 + (i/10000)%10;
            if(sum >=a && sum <= b) ans += i;
        }
        
        System.out.println(ans);
    }
}
