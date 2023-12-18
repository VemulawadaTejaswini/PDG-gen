import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] =new int[N];
        int num=1;
        int count=0;
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            
        }
        
        for(int j=0;j<N;j++){
            if(num==2){
                System.out.println(count);
                return;
            }
            num=A[num-1];
            count++;
            
        }
        
        System.out.println(-1);
        
        
        
    }
}
