import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        long n = stdIn.nextLong();
        // long sum = 0;
        
        
        // for(int i = 1; i < n; i++){
        //     sum += i %( i + 1);
        // }
        
        // num[0] = 1;
        // w[0] = 2;
        // w[n - 1] = 1;
        
        // for(int i = 0; i < n; i++){
        //     //sum += num[i] % w[i];
        //     System.out.println(num[i] + " " + w[i]);
        // }
        
        System.out.println((n * n - n) / 2);
    }
}
