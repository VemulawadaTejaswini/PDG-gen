import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();

        int num = N*(N-1)/2 - (N/2);
        System.out.println(num);

        if(N%2 == 0){
            for(int i = 1; i <= N-1; i++){
                for(int j = i+1; j <= N; j++){
                    if(i+j != N+1){
                        System.out.println(i + " " + j);
                    }
                }
            }
        } else {
            for(int i = 1; i <= N-1; i++){
                for(int j = i+1; j <= N; j++){
                    if(i+j != N){
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}