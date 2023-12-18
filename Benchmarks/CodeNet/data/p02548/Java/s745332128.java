import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ab;
        int yakusu[] = new int[n];
        yakusu[0] = 0;
        for(int i = 1; i < n; i++){
            for(int j = 1; i * j < n; j++){
                yakusu[i * j] += 1;
            }
        }
        int cnt = 0;
        int yakusu_sum[] = new int[n];
        yakusu_sum[0] = 0;
        for(int i = 1; i < n; i++){
            cnt += yakusu[i];
            yakusu_sum[i] = cnt;
        }
        
        System.out.println(yakusu_sum[n - 1]);
    }
}
