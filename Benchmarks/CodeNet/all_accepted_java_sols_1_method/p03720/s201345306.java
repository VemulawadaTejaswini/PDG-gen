import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] edge = new int[N+1][N+1];
		for(int i = 0; i < M; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			edge[a][b]++;
			edge[b][a]++;
		}
		
		for(int i = 1; i <= N; i++){
			int sum = 0;
			for(int j = 1; j <= N; j++) sum += edge[i][j];
			System.out.println(sum);
		}
	}
}
