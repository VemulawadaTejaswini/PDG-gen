import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;

        i:
        for(int i = 0; i <= n / r; i++){
            for(int j = 0; j <= n / g; j++){
                int sum = r * i + g * j;
                if(sum > n){
                    continue i;
                }
                if((n - sum) % b == 0){
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
