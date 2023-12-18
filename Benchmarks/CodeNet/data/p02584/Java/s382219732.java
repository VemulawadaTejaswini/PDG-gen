import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long x = sc.nextLong(), k = sc.nextLong(), d = sc.nextLong(), ans;
        x = Math.abs(x);
        if (x >= k*d){
            ans = Math.abs(x) - k*d;
        }else{
            long step = x/d;
            k -= step;
            if (k%2 == 0){
                ans = x - d*step;
            }else{
                ans = Math.abs(x-d*(step+1));
            }
        }
        System.out.println(ans);
    }    
}