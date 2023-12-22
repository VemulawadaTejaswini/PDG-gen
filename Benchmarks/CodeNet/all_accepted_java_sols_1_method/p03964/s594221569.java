import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		long T[] = new long[n];
		long A[] = new long[n];
		
		for(int i=0;i<n;i++){
		    T[i] = sc.nextInt();
		    A[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
		    long t = T[i+1];
		    long a = A[i+1];
		    if(T[i]>T[i+1]||A[i]>A[i+1]){
		        long j = Math.max((T[i]-1)/T[i+1],(A[i]-1)/A[i+1])+1;
		        T[i+1]=t*j;
		        A[i+1]=a*j;
		    }
		}
		// 出力
		System.out.println(T[n-1] + A[n-1]);
    }
}
