import java.util.Scanner;

public class Main{

	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());		
		
		int[][] matrix = new int[n][m];
		
		for(int i=0; i<n;i++){
			
			for(int j=0; j<m;j++){
				
				matrix[i][j] = Integer.parseInt(sc.next());
				
			}
			
		}
		
		int[] vector = new int[m];
		for(int i=0; i<m;i++){
			
			vector[i] = Integer.parseInt(sc.next());
			
		}
		
		for(int i=0; i<n;i++){
			int sum = 0;
			for(int j= 0; j<m ;j++){
				
				sum += matrix[i][j] * vector[j];
			}
			System.out.print(sum +"\n");
		}
		
		
		
		sc.close();
	}

}
