import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long n = Long.parseLong(N); 
        
        long i = 0;
        long sum = 0; 
        do{
            i++;
            sum += i;
        } while (!(sum % n == 0)); 
        
        System.out.println(i);
        
    }    
}