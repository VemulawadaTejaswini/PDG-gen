import java.util.Scanner;

public class Main{
	public static double expect(double[][] x){
		double sum = 0;
		for(int i = 0; i < x.length; i++){
			sum += x[i][1];
		}
		double result = 0;
		for(int i = 0; i < x.length; i++){
			result += x[i][0]*x[i][1]/sum;
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int T = stdIn.nextInt();
		double max = 0;
		for(int i = 0; i < T; i++){
			int n = stdIn.nextInt(), m = stdIn.nextInt();
			double[][] p = new double[m][2];
			for(int j = 0; j < m; j++){
				p[j][0] = stdIn.nextDouble();
				p[j][1] = stdIn.nextDouble();
			}
			double key = expect(p);
			if( key > max ){
				max = key;
			}
		}
		int n = stdIn.nextInt(), m = stdIn.nextInt();
		double[][] p = new double[m][2];
		for(int j = 0; j < m; j++){
			p[j][0] = stdIn.nextDouble();
			p[j][1] = stdIn.nextDouble();
		}
		double key = expect(p);
		if( max-key >= 0.0000001 ){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}