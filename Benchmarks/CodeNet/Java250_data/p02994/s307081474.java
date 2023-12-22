import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        
        int absMin = 1000000;
        int eatNum = 0;
        for(int i = 1; i <= N; i++){
            if ( absMin > Math.abs(L + i - 1) ){
                absMin = Math.abs(L + i - 1);
                eatNum = i;
            }
        }
        
        int sum = 0;
        for(int i = 1; i <= N; i++){
            if ( i == eatNum ) continue;
            sum += (L + i - 1);
        }
        
        System.out.println(sum);
    }
}
