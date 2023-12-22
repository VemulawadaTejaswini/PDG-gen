import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long x = n % k;
        long min = x;
        if(min > Math.abs(x - k)){
            min = Math.abs(x - k);
        }
        System.out.println(min);
    }
}
