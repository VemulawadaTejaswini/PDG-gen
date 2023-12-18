import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

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
		
		int[] matrix=new int[sumNeeded+1];
		
		for(int i=1;i<matrix.length;i++)
			matrix[i]=Integer.MAX_VALUE;
		
		
		for(int sum=1; sum<matrix.length;sum++){			
			for(int j=0; j<values.size(); j++){				
				int coinValue=values.get(j);				
				if(sum>=coinValue) {
					matrix[sum] =Math.min(matrix[sum],matrix[sum-coinValue] + 1);
					//System.out.println("Updated matrix[" + sum + "] = " + matrix[sum] );
				}					
			}		
		}
		
		System.out.println(matrix[sumNeeded]);
	}

}