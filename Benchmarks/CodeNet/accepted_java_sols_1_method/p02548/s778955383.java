import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        long ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i*j>=n) break;
                ans++;
            }
        }
        
        System.out.println(ans);
    }
    
}