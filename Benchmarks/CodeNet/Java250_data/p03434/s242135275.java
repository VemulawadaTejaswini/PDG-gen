import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;

        for(int i = n-1; i > -1; i--){
            if(i%2==0) ans += a[i];
            else ans -= a[i];
        }
        
        if(n%2==0) ans *= -1;
        
        System.out.println(ans);
    }
}
