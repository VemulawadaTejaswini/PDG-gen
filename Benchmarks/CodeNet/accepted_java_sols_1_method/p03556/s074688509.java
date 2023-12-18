import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N =sc.nextLong();
        long x=0;
        int i=1;
        while(x<=N){
            x=i*i;
            i++;
            
        }
        System.out.println((i-2)*(i-2));
        
    }
}
