
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        final int MAX=55555;
        boolean[] isPrime =new boolean[MAX];
        for(int i=0;i<MAX;i++){
            isPrime[i]=true;
        }
        for(int i=2;i<240;i++){
            if(isPrime[i-1]==false) continue;
            for(int j=0;j<MAX/i;j++){
                if(j>0){
                    isPrime[i*(j+1)-1]=false;
                }
            }
        }
        int[] results=new int[N];
        int index=0;
        for(int i=1;i<MAX;i++){
            if((i+1)%5==1){
                if(isPrime[i]){
                    results[index]=i+1;
                    index++;
            if(index==N){
                break;
            }
                }
                
            
            }
        }
        for(int i=0;i<N-1;i++){
            System.out.print(results[i]+" ");
        }
        System.out.println(results[N-1]);
        
    }
}
