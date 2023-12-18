import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = 0; 
        int ans = 0;

        for(int i=1; i<=N; i+=2){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    x += 1;
                }
            }
            if(x==8){
                ans += 1;
            }
            x = 0;
        }
        System.out.println(ans);
    }
}