import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long ans = 0;
        if((b-a) % 2 == 0) {
            System.out.println((b-a)/2);
        }else {
            if(n-a < b-1) {
                ans = n-b+1;
                a += (n-b)+1;
                b = n;
                
                System.out.println(ans + (b-a)/2);          
            }else {
                ans = a;
                b -= a-1;
                a = 1;
                System.out.println(ans + (b-a)/2);  
                
            }
        }
    }
 
}