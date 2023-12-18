import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        
        int i;
        for(i = 1;i <= n;i++){
            a[i] = sc.nextInt();
        }
        
        for(i = 1;i <= n;i++){
            if(i % 2 == 0){
                a[i] = 101;
            }
        }
        
        for(i = 1;i <= n;i++){
            if(a[i] % 2 == 0){
                a[i] = 101;
            }
        }
        
        int ans=0;
        for(i = 1;i <= n;i++){
            if(a[i] != 101){
                ans++;
            }
        }
        System.out.println(ans);
        
        

        
    }
}
