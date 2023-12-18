import java.util.*;
public class Solution{
    public static void main(String[] ar){
        int i,j,N,tmp,cnt;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
	
		int [] A = new int [N];
		
		for(i=0; i<N; i++){
			A[i] =sc.nextInt();
		}
		cnt =0;
		for(i=0;i<N-1;i++){
			for(j=0;j<N-(i+1);j++){
				if(A[j] > A[j+1]){
					tmp  = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
					cnt++;
				}
			}
		}
		
		for(int r=0; r<N; r++){
			System.out.print(A[r]+" ");
		}
		System.out.println("\r\n"+cnt);
    }
}

