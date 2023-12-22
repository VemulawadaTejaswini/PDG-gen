import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();

        long a = N-A;
        long b = B-1;
        long ans = Math.min(a, b);

        if((A+B)%2 == 0){
            ans = Math.min((A+B)/2-A, ans);
        }else{
            long c = (B-A-1)/2+A;
            long d = (N-(A+(N-B+1)))/2+(N-B+1);
            long e = Math.min(c, d);
            ans = Math.min(e, ans);
        }
        System.out.println(ans);
    }
}
