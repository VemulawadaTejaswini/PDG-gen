import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int ans = 0;
        
        for(int k=1; k<=n; k+=2){
            for(int i=1; i<=k; i+=2){
                if(k%i == 0){
                    cnt++;
                }
            }
            if(cnt == 8){
                ans++;
            }
            cnt = 0;
        }
        System.out.println(ans);
    }
}
