
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] graph = new int[a][a];


		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j ++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		boolean[] visit = new boolean[a];
		
		int number = 0;
		int[] current = new int[2];
		
		int sum = 0;
		visit[0] = true;
		while(true) {
			int val = 10000000;
			current[0] = -1;
			current[1] = -1;
			
			for(int i = 0; i < a; i++) {
				if(visit[i] == true) {
					for(int j = 0; j < a; j++) {

						if(val > graph[i][j] && graph[i][j] >= 0 && visit[j] == false) {
							val = graph[i][j];
							current[0] = i;
							current[1] = j;
						}
					}
				}	
			}
			visit[current[1]] = true;
			sum += val;
			number ++;
			if(number == a) break;
			
		}
		
		System.out.println(sum);

	}
}
