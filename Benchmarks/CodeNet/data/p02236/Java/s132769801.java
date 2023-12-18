import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double p[] = new double[n + 1];
		double q[] = new double[n + 1];
		
		String tmpArray[] = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			p[i + 1] = Double.parseDouble(tmpArray[i]);
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n + 1; i++){
			q[i] = Double.parseDouble(tmpArray[i]);
		}
		
		double e[][] = new double[n + 2][n + 1];
		int root[][] =  new int[n + 1][n + 1];
		
		optimalBST(p, q, e, root);
		
		System.out.printf("%.5f\n",e[1][n]);
	}
	
	static void optimalBST(double p[], double q[], double e[][], int root[][]){
		int n = p.length - 1;
		
		double[][] w = new double[n + 2][n + 1];

		for(int i = 1; i <= n + 1; i++){
			e[i][i - 1] = q[i - 1];
			w[i][i - 1] = q[i - 1];
		}
		
		for(int l = 1; l <= n; l++){
			for(int i = 1; i <= n - l + 1; i++){
				int j = i + l - 1;
				e[i][j] = Double.MAX_VALUE;
				
				w[i][j] = w[i][j - 1] + p[j] + q[j];
				
				for(int r = i; r <= j; r++){
					double t = e[i][r - 1] + e[r + 1][j] + w[i][j];
					
					if(t < e[i][j]){
						e[i][j] = t;
						root[i][j] = r;
					}
				}
			}
		}
	}

}

