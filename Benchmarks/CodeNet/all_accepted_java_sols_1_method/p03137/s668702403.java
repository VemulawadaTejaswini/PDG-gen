import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        if(N>=M){
            System.out.println(0);
            return;
        }
        
        int[] X=new int[M];
        
        for(int i=0;i<M;i++){
            X[i]=sc.nextInt();
        }
        
        Arrays.sort(X);

        int[] Xdif=new int[M-1];
        
        for(int i=0;i<M-1;i++){
            Xdif[i]=X[i+1]-X[i];
        }
        
        Arrays.sort(Xdif);
        int SUM=0;
                
        for(int i=0;i<M-1;i++){
            SUM+=Xdif[i];
        }
        
        for(int i=0;i<N-1;i++){
            SUM-=Xdif[M-i-2];
        }
        
        System.out.println(SUM);
    }
}
