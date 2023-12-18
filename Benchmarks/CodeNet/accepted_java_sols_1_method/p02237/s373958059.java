import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = n;
		int [][]graph = new int[size][size];
		
		while(n-- > 0) {
			int u = sc.nextInt() - 1;
			int k = sc.nextInt();
			while(k-- > 0) {
				graph[u][sc.nextInt() - 1] = 1;
			}
		}
			
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(graph[i][j]);
				System.out.print(j < size - 1 ?" ":"");
			}
			System.out.println();
		}
	}
}
