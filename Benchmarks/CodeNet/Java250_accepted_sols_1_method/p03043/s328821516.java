import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        double probability = 0;
        
        for(int i = 1; i <= N; i++){
            if ( i >= K ) {
                probability += 1.0;
            } else {
                double x =  Math.log( (double)K/i ) / Math.log(2) ;
                x = Math.max(Math.ceil(x) , 1);
                probability += 1 / Math.pow(2, x);   
            }
        }
        
        System.out.println(probability/N);
    }
}
