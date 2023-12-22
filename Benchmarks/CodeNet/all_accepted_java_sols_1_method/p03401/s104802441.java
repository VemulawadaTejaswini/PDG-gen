import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(),answer=0;
		int smaller=0,smallest=0;
		int larger=0,largest=0;
		int[] A=new int[N+2];
		A[0]=0;
		A[N+1]=0;
		for(int i=1;i<N+1;i++){
			A[i]=sc.nextInt();
			answer=answer+Math.abs(A[i-1]-A[i]);
		}
		answer=answer+Math.abs(A[N]);
		for(int i=1;i<N+1;i++){
			if(A[i-1]<A[i] &&A[i+1]<A[i]){
				System.out.println(answer-Math.abs(A[i-1]-A[i])-Math.abs(A[i]-A[i+1])+Math.abs(A[i-1]-A[i+1]));
			}else if(A[i-1]>A[i] && A[i+1]>A[i]){
				System.out.println(answer-Math.abs(A[i-1]-A[i])-Math.abs(A[i]-A[i+1])+Math.abs(A[i-1]-A[i+1]));
			}else{
				System.out.println(answer);
			}
		}
	}
}
