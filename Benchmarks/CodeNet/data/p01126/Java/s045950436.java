import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int a = Integer.parseInt(tmpArray[2]);
		
		int changePoint[][] = new int[1001][n+1];
		
		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			int h = Integer.parseInt(tmpArray[0]);
			int p = Integer.parseInt(tmpArray[1]);
			int q = Integer.parseInt(tmpArray[2]);
			
			if(h == 0 && p == 0 && q == 0){
				break;
			}
			
			changePoint[h][p] = q;
			changePoint[h][q] = p;
			
		}
		
		for(int i = 1000; i >= 1; i--){
//			for(int j = 0; j <= n; j++){
//				System.out.print(changePoint[i][j]+" ");
//			}
//			System.out.println();
			if(changePoint[i][a] != 0){
				a = changePoint[i][a];
//				System.out.println("i = "+i+" change to "+a);
			}
		}
		
		System.out.println(a);
	}

}