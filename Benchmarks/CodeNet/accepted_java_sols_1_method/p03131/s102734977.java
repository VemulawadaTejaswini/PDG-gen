import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long MAX = 1;

        if(A >= B || B-A ==1){
            MAX += K;
        }else{
            while(MAX < A){
                K--;
                MAX++;
            }
            while(K > 1){
                K -=2;
                MAX += B-A;
            }
            while(K > 0){
                K--;
                MAX++;
            }
        }
        System.out.println(MAX);
    }
}
