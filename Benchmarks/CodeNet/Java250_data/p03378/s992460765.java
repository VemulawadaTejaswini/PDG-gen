import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int A[] =new int[N+1];
        
        int num1=0;
        int num2=0;
        int m;
        
        for(int i=1;i<=M;i++){
            
            m=sc.nextInt();
            A[m]=1;
            
        }
        for(int i=X;i>=0;i--){
            
            num1+=A[i];
            
        }
        for(int i=X;i<=N;i++){
            
            num2+=A[i];
            
        }
        int min_num = Math.min(num1, num2);
        
        System.out.println(min_num);
        
    }
}
