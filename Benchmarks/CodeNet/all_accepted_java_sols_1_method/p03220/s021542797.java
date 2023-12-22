import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();	
			int T =sc.nextInt();
			int A =sc.nextInt();
			int []H=new int[N];
			double []J=new double[N];
			double []K=new double[N];
			double min=100000;
			int mini=0;
						
				for(int i=0;i<N;i++){
					H[i]=sc.nextInt();
				}
				for(int i=0;i<N;i++){
					J[i]=T-H[i]*0.006;
				}
				for(int i=0;i<N;i++){
					K[i]=Math.abs(A-J[i]);
				}
				for(int i=0;i<N;i++){
					if(K[i]<min){
						min=K[i];
						mini=i+1;
					}
				}
			System.out.println(mini);
	}
}