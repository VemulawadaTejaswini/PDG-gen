import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(),D=sc.nextInt(),X=sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int answer=X;
		for(int i=0;i<N;i++){
			answer=answer+(D-1)/A[i]+1;
		}
		System.out.println(answer);
	}
}
