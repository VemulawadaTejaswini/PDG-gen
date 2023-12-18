import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double[] A = new double [2];
			double[] B = new double [2];
			double[] C = new double [2];
			double[] D = new double [2];
			
			A[0] = sc.nextDouble();  A[1] = sc.nextDouble();
			B[0] = sc.nextDouble();  B[1] = sc.nextDouble();
			C[0] = sc.nextDouble();  C[1] = sc.nextDouble();
			D[0] = sc.nextDouble();  D[1] = sc.nextDouble();
			
			boolean f = false;
			if(B[0]-A[0]!=0. && D[0]-C[0]!=0.){
				double AB = (B[1]-A[1])/(B[0]-A[0]);
				double CD = (D[1]-C[1])/(D[0]-C[0]);
				
				f |= AB*CD==-1.0;
			}else{
				f |= B[0]-A[0]==0. && D[1]-C[1]==0.;
				f |= D[0]-C[0]==0. && B[1]-A[1]==0.;
			}
			
			System.out.println(f ? "YES" : "NO");
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}