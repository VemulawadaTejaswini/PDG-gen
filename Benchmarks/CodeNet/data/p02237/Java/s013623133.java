import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = n;
		int [][]graph = new int[size][size];
		
		
		for(int i = size; i > 0; i--) {
			int j = sc.nextInt() -1;
			int k = sc.nextInt();
		
			while(k-- > 0) {
			graph[j][sc.nextInt() - 1]++;
			}
		}
		for(int i = 0; i < size; i ++) {
			System.out.print(graph[i][0]);
			for(int j = 1; j < graph[i].length; j++) {
					System.out.print( " " + graph[i][j]);
					
				
			}
			System.out.println();
		}
	}
}

