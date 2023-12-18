import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 10000000007L;
        long ans = 9;
        if(n < 2){
            System.out.println(0);
        }else if(n < 3){
            System.out.println(2);
        }else{
            for(int i = 0;i<n - 2;i++){
                for(int j = i;j<n - 2;j++){
                    ans *= 9;
                    ans %= mod;
                }
            }
            System.out.println(ans);
        }
    }
}
