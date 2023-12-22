import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n,result=0;
        
        n = sc.nextLong();
        result = n - 1;
        
        
        for(long i = 2; i <= n / i; i++){
            if(n % i == 0){
                long j = n / i;
                if(((i - 1) + (j - 1)) < result){
                    result = (i - 1) + (j - 1);
                }
            }
        }
        
        
        System.out.println(result);
    }
}
