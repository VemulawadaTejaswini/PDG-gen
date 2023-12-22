import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=0; i<=3000; i++){
            for(int j=0; j<=3000; j++){
                int tmp = n - (r*i + g*j);
                if(tmp >= 0 && tmp%b==0){
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
    
}
