import java.util.Scanner;

public class Main{
	public static int solve(double[] p, double[] q){
		double dist = Math.sqrt((q[0]-p[0])*(q[0]-p[0])+(q[1]-p[1])*(q[1]-p[1]));
		if( dist <= p[2]+q[2] ){
			if( p[2]-dist > q[2] ){
				return 2;
			} else if( q[2]-dist > p[2] ){
				return -2;
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] result = new int[N];
		
		for(int i = 0; i < N; i++){
			double[][] p = new double[2][3];
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 3; k++){
					p[j][k] = stdIn.nextDouble();
				}
			}
			result[i] = solve(p[0],p[1]);
		}
		for(int i = 0; i < N; i++){
			System.out.println(result[i]);
		}
	}
}