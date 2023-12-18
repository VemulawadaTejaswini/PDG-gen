import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A=new long[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextLong();
        }

        //long res = 0;
        
        for(int i=0; i<N-K; i++){
            if(A[i]<A[i+K]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        
        //System.out.println(res);
        
        }
    }