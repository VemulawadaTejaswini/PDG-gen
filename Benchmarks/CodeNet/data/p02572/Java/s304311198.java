import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A[]=new int[N];
        
        int n = 0;
int m = 0;
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        
        
        for(int k=0; k<N-1; k++){
            for(int l=k+1; l<N; l++){
                m = n + (A[k]*A[l])%1000000007;
               if(m<1000000007){
                   n=n+m;
               }else{
                   n=(n+m)%1000000007;
               }
            }
        }
        
        
        
        
        
        
        
        
          System.out.println(n);
        }
    }
