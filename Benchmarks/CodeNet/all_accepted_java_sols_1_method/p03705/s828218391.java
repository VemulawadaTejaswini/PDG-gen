import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = (n - 1) * l + r;
        long max = (n - 1) * r + l;
        long ans = max - min + 1;
        if(ans < 0){
            ans = (long)0;
        }
        System.out.println(ans);
    }
}
