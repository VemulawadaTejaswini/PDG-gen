import java.util.*; 
import java.lang.*; 
 
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int cnt = 0;
		double Anum = 0;
		
		double[] A = new double[N+1];
		for(int i=1; i<=N; i++){
			A[i] = scan.nextInt();
			Anum = Anum + A[i];		
		}
		
		double k = Anum/(4*M);
		
		for(int i=1; i<=N; i++){
		if(A[i]>=k){
				cnt = cnt+1;
			}
		}
		
		if(cnt>=M){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}	
}