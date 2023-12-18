import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int INF = 1000000000;
	int cityAmount;
	int root[][];
			
	public Main(){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			cityAmount = scan.nextInt();
			if(cityAmount == 0) break;
			
			root = new int[cityAmount+1][cityAmount+1];
			for(int[] l:root)Arrays.fill(l, INF);
			
			//Create root map 
			for(int i = 0; i < cityAmount ;i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				root[a][b] = c;
				root[b][a] = c;
			}
			
			for ( int k = 0; k < cityAmount+1; k++ ){
		        for ( int i = 0; i < cityAmount+1; i++ ){
		            for ( int j = 0; j < cityAmount+1; j++ ){
		            	root[i][j] = Math.min( root[i][j], root[i][k] + root[k][j] );
		            }
		        }
		    }

			int cityNo = 0;
			int sum = INF;
			for ( int i = 0; i < cityAmount+1; i++ ){
	            int tmpSum = 0;
				for ( int j = 0; j < cityAmount+1; j++ ){
	            	if(i != j && root[i][j] != INF){
	            		tmpSum += root[i][j];
	            	}
	            }

	            if(tmpSum != 0 && sum > tmpSum){
	            	sum = tmpSum;
	            	cityNo = i;
	            }
	        }
			System.out.println(cityNo +" "+ sum);
			
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}