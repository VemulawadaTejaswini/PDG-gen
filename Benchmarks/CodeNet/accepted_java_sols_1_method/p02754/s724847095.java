import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = a * (n / (a+b));
        n %= (a+b);
        if(n >= a){
            System.out.println(ans+a);
        }else{
            System.out.println(ans+n);
        }
        
    }
}
 