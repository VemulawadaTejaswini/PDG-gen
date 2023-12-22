import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = a;
        int count = 1;
        while(true) {
            n = 2*n;
            if(n > b) break;
            count++;
        }
        System.out.println(count);
    }  
}