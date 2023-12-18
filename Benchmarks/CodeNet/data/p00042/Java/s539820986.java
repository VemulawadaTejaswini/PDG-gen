import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static String rLine = "";
	public static Integer Weigth = 0;
	public static Integer ItemNum = 0;
	public static HashMap<Integer, Integer> ItemWeigths = new HashMap<Integer,Integer>();
	public static HashMap<Integer, Integer> ItemValues = new HashMap<Integer,Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int caseCount = 1;
		
		while(!(rLine = in.readLine()).equals("0"))
		{
			if (!rLine.isEmpty()) 
			{
	
				Weigth = Integer.parseInt(rLine);
				
				ItemNum = Integer.parseInt(in.readLine());
				
				for(int i=0;i<ItemNum;i++){
					String[] str=in.readLine().split(",");
					ItemValues.put(i, Integer.parseInt(str[0]));
					ItemWeigths.put(i, Integer.parseInt(str[1]));
				}
				
				pickup(caseCount);
				caseCount ++;
				ItemWeigths.clear();
				ItemWeigths.clear();
			}
		}
		

	}
	
//	private static int knapsack(int indx, int W) {
//	    if (indx < 0) {
//	        return 0;
//	    }
//	    if (ItemWeigths.get(indx) > W) {
//	        return knapsack(indx-1, W);
//	    } else {
//	        return Math.max(knapsack(indx-1, W), knapsack(indx-1, W - ItemWeigths.get(indx)) + ItemValues.get(indx));
//	    }
//	}

	
	private static void pickup(int count){
		int[][] SelectionTable = new int[ItemNum+1][Weigth+1];
		
		int minWeight=0;
		
		for(int i=0;i <= Weigth; i++){
			SelectionTable[ItemNum][i]=0;
		}
		
		for(int i=ItemNum-1; i>=0; i--){
			for(int j=0; j <= Weigth; j++){
				if(j<ItemWeigths.get(i)){
					SelectionTable[i][j]=SelectionTable[i+1][j];
				}
				else{
					SelectionTable[i][j]=Math.max(SelectionTable[i+1][j],SelectionTable[i+1][j-ItemWeigths.get(i)]+ItemValues.get(i));
					if(0 < j && SelectionTable[i][j] != SelectionTable[i][j-1]){
						minWeight = j;
					}
				}
			}
		}
		
		System.out.printf("Case %d:\n", count);
		System.out.println(SelectionTable[0][Weigth]);
		System.out.println(minWeight);
	}

}