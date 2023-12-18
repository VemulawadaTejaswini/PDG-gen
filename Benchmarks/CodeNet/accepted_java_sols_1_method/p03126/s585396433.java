import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N =sc.nextInt();
        int M =sc.nextInt();
        
        int count=0;
        
        int food[] =new int[M];
        
        for(int i=0;i<N;i++){
            int K =sc.nextInt();
            for(int j =0;j<K;j++){
                int A =sc.nextInt();
                food[A-1] +=1;
                
            }
        }
        
        for(int k=0;k<M;k++){
            if(food[k]==N){
                count++;
            }
        }
        
        System.out.println(count);
        
        
        
        
        
    }
}
