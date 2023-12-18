
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/20 11:36 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long k = scanner.nextLong();
        long d = scanner.nextLong();
        long ans = 0;
        if(x <= 0){
            long n = -x/d;
            if(x%d !=0)n++;
            if(n > k){
                ans = Math.abs(x+k*d);
            }else{
                if((k - n)%2 == 0){
                    ans = Math.abs(x+n*d);
                }else{
                    ans = Math.abs(x+(n-1)*d);
                }
            }
        }else{
            long n = x/d;
            if(x%d !=0)n++;
            if(n > k){
                ans = Math.abs(x-k*d);
            }else{
                if((k - n)%2 == 0){
                    ans = x-n*d;
                }else{
                    ans = Math.abs(x-(n-1)*d);
                }
            }
        }
        System.out.println(ans);
    }
}
