import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        int [] A = new int [N];
        for(int i=0; i<N; i++){
        	A[i] = sc.nextInt();
        }
        
        long [] L = new long [N];
        for(int i=1; i<N; i++){
        	if(A[i]<A[i-1]){
            	L[i]=A[i-1]-A[i];
                A[i]=A[i-1];
            } else{
            	L[i]=0;
            }
        }
      	
      	long S;
   		S=0;
      	for(int i=1; i<N; i++){
        	S=S+L[i];
        }     	
        // 出力
        System.out.println(S);
    }
}
