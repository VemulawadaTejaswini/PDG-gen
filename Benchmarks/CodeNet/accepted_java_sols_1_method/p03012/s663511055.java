import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W[] = new int[N];
        W[0] = sc.nextInt();
        for(int i = 1; i < N; i++){
            W[i] = W[i - 1] + sc.nextInt();
        }
        int result = 100000;
        for(int i = 0; i < N; i++){
            int S1 = W[i];
            int S2 = W[N - 1] - S1;
            int total = 0;
            if(S1 < S2){
                total = S2 - S1;
            }else{
                total = S1 - S2;
            }
            if(result > total){
                result = total;
            }
        }
        System.out.println(result);
    }
}
