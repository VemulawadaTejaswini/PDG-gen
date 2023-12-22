import java.util.*;

public class Main{
    public static void main(String[] args){

        int score_A = 1;
        int score_B = 0;
        int score_C = -1;
        
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        int score=0;
        for(int loop=0; loop<K; loop++){
            if(A>0){
                score += score_A;
                A--;

            }else if(B>0){
                score += score_B;
                B--;

            }else{
                score += score_C;
                C--;
            }
        }
        System.out.println( score );
    }
}