
import java.util.Scanner;
 
public class Main {
	
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] x = new int[N][D];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				double sum = 0;
				for(int d=0;d<D; d++) {
				int	xd=x[i][d]-x[j][d];
					sum += xd*xd;
					//System.out.println(x[i][d]);
					//System.out.println(x[j][d]);
				}
			
			double dist = Math.sqrt(sum);  //Math.sqrt() 関数は、数値の平方根を返す
			//System.out.println(dist);
			if (dist == Math.floor(dist)) { //distが整数だったら countに+1する
				count++;
			}
			}
		}
		System.out.println(count);
	   
	}
}