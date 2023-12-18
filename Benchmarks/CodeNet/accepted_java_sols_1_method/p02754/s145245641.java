import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = (long) (n / (a + b));
        long d = n % (a + b);
        if(d <= a){
            long l = a * c + d;
            System.out.println(l);
        }else{
            long l = a * (c + 1);
            System.out.println(l);
        }
    }
}