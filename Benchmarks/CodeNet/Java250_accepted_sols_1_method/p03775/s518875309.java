import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        sc.close();
       
        long max = N;
        for(long i = 2; (i*i) <= N; i++){
            if(N%i == 0){
                max = N/i;
            }
        }
        int count = 1;
        while(max/10 != 0){
            count++;
            max /= 10;
        }
        System.out.println(count);
   }
}