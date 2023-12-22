import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long sum = 0;
        
        if(K<A){
            sum = K;
        }
        else if(K<=A+B){
            sum = A;
        }
        
        else{
            sum = A - (K-A-B);
        }
        System.out.println(sum);
    }
}
