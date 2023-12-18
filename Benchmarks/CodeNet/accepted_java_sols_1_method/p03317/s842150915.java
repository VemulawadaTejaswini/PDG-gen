import java.util.Scanner;

public class Main{

     public static void main(String []args){
        
        int N,K;
        int Ans = 0;
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        K = input.nextInt();
        
        Ans = (N-1)/(K-1);

        if( (N-1)%(K-1) != 0){
            Ans++;
        }
        
        System.out.println(Ans);
     }
}