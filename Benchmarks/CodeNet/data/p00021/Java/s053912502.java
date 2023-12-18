import java.util.Scanner;

public class Main{
	public static boolean solve(double[][] x){
		if( x[1][0]-x[0][0] == 0 && x[3][0]-x[2][0] == 0 ){
			return true;
		} else if( x[1][0]-x[0][0] == 0 || x[3][0]-x[2][0] == 0 ){
			return false;
		}
		double a = (x[1][1]-x[0][1])/(x[1][0]-x[0][0]);
		double b = (x[3][1]-x[2][1])/(x[3][0]-x[2][0]);
		return a == b;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] result = new String[n];
		for(int k = 0; k < n; k++){
			double[][] a = new double[4][2];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 2; j++){
					a[i][j] = stdIn.nextDouble();
				}
			}
			if( solve(a) ){
				result[k] = "Yes";
			} else {
				result[k] = "No";
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(result[i]);
		}
	}
}