import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = n % (a + b);
        long out = 0;
        if(c <= a){
            out = c + (n / (a + b)) * a;
        }else{
            out = a + (n / (a + b)) * a; 
        }
        System.out.println(out);
    }
}