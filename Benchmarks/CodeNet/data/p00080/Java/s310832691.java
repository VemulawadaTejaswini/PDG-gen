import java.util.*;
public class Main {
	double EPS = 1.0e-05;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int q = sc.nextInt();
			if(q == -1) break;
			double prev = (double) q / 2;
			for(int i = 0; ; i++){
				double res = prev - (prev * prev * prev - q) / (3 * prev * prev);
				if(Math.abs(res * res * res - q) < EPS){
					System.out.printf("%.6f\n",res);
					break;
				}
				prev = res;
			}
		}
		//System.out.printf("%.6f\n",EPS);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}