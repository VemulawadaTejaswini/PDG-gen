import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong(),
             a = scan.nextLong(),
             b = scan.nextLong(),
             c = n % (a + b);
        long out = (n / (a + b)) * a + (c <= a ? c: a);
        System.out.println(out);
    }
}