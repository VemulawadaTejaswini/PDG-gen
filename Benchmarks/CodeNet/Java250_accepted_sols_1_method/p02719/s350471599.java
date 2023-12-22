import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long min = Long.MAX_VALUE;
        long amari = 0;

        min = n%k;
        if(min > k-min){
            min = k-min;
        }
        System.out.println(min);
    }
}