import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        n -= k * (n / k - 1);
        System.out.println(Math.min(Math.abs(n - k), Math.abs(n - k * 2)));
    }
}