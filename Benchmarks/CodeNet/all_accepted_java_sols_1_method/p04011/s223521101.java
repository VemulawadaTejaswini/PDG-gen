import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long k = in.nextInt();
        long x = in.nextInt();
        long y = in.nextInt();
        
        long sum = 0;
        
        if(n >= k){
            sum += k * x;
            sum += (n - k) * y;
        }
        else{
            sum += n * x;
        }
        System.out.println(sum);
    }
}
