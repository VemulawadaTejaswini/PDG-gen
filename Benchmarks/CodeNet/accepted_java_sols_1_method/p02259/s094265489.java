import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print(A[0]);
		for(int r=1; r<N; r++){
			System.out.print(" "+A[r]);
		}
		System.out.println("\r\n"+cnt);

	}

}
