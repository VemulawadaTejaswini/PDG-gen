import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] queue = new int[n][m];
		int[] vector = new int[m];
		int[] vectorAns = new int[n];

		for(int i = 0; i < queue.length; i++){
			for(int j = 0; j < queue[i].length; j++){
				queue[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < vector.length; i++){
			vector[i] = sc.nextInt();
		}
		for(int i = 0; i < vectorAns.length; i++){
			for(int j = 0; j < queue[i].length; j++){
				vectorAns[i] += queue[i][j] * vector[j];
			}
		}
		for(int data: vectorAns){
			System.out.println(data);
		}
	}
}


