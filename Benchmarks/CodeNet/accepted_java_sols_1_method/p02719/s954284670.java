import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long minsub = Math.abs(n-k)+1;
        long t = n%k;
        long answer = Math.min(t,k-t);
        System.out.print(answer);
    }
}