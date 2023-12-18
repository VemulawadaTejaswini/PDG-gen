import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		
		int sumNeeded = in.nextInt();
		int coins=in.nextInt();
		
		ArrayList<Integer> values=new ArrayList<Integer>(coins);
		
		
		for(int i=0;i<coins;i++){
			values.add(in.nextInt());
		}
		
		Collections.sort(values);		
		
		int[][] matrix=new int[values.size()+1][sumNeeded+1];
		
		
		for(int i=0;i<matrix.length;i++){
			
			for(int j=0;j<matrix[0].length;j++) {
				
				if(i==0 || j==0)
					matrix[i][j]=0;
				else
					matrix[i][j]=Integer.MAX_VALUE;
			}			
		}
		
		for(int i=1; i<matrix.length;i++){
			
			for(int j=1;j<matrix[0].length;j++) {
				
				int coinVal=values.get(i-1);
				
				if(coinVal>j)
					matrix[i][j]=matrix[i-1][j];
				else{					
					matrix[i][j]= Math.min(j/coinVal + matrix[i][j%coinVal],(matrix[i-1][j]==0) ? matrix[i][j] : matrix[i-1][j]);
				}
			}		
			
		}	
		
		System.out.println(matrix[values.size()][sumNeeded]);
	}

}