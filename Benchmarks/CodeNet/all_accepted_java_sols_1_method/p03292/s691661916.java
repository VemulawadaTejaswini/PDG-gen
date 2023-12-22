/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int[] array = new int[3];
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		
		int minCost = 300;
		
		for(int i = 0; i < 3 ; i++) {
			int nextMinCost = 100;
			int nextMinNumber = 0;
			for(int j = 0; j < 3 ; j++) {
				int totalCost = 0;				
				if(j == i) {
					continue;
				}
				
				for(int z = 0; z < 3 ; z++) {
					if(z != i && z != j) {
						totalCost += Math.abs(array[j] - array[i]) + Math.abs(array[z] - array[j]);
					}
				}
				if(totalCost < minCost) {
					minCost = totalCost;
				}
			}	

		}
	
		// 出力
		System.out.println(minCost);
	}

}
