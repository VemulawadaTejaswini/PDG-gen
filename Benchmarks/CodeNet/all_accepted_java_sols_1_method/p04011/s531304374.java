import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        int N = input.nextInt();
        int K = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        
        int sum = 0;
        if(N>=K){
            for(int i = 1; i<=K; i++)
                sum+=X; 
            for(int j = 1; j<=N-K; j++)
                 sum+=Y;
        }else
            for(int i = 1; i<=N; i++)
              sum+=X;
        
        System.out.println(sum);
        
    }
}
