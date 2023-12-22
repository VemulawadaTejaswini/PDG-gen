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
		int[][] A = new int[2][N+1];
		for(int i = 1; i <= N; i++){
			A[0][i] = A[0][i-1] + in.nextInt();
		}
		for(int i = 1; i <= N; i++){
			A[1][i] = A[1][i-1] + in.nextInt();
		}
		
		int max = 0;
		for(int i = 1; i <= N; i++){
			int m = (A[0][i] - A[0][0]) + (A[1][N] - A[1][i-1]);
			//System.out.println((A[0][i] - A[0][0]) + " " + (A[1][N] - A[1][i-1]));
			max = Math.max(m, max);
		}
		
		System.out.println(max);
	}
}
