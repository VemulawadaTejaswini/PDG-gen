import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int A[] = new int[3];
		for(int n=0;n<3;n++){
			A[n] = sc.nextInt();
		}
		int K = sc.nextInt();

		long v = 0;
		if(A[0] >= A[1] && A[0] >= A[2]){
			v += A[0] * Math.pow(2,K);
			v += A[1]+A[2];
		}
		else{
			if(A[1] >= A[0] && A[1] >= A[2]){
				v += A[1] * Math.pow(2,K);
				v += A[0]+A[2];
			}
			else{
				if(A[2] >= A[0] && A[2] >= A[1]){
					v += A[2] * Math.pow(2,K);
					v += A[1]+A[0];
				}
			}
		}
		

		System.out.println(v);
	}
}