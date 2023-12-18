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
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		X++;
		int Y = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[M];
		for(int i = 0; i < N; i++) x[i] = sc.nextInt();
		for(int i = 0; i < M; i++) y[i] = sc.nextInt();
		int max_x = -101;
		int min_y = 101;
		
		for(int i = 0; i < N; i++)
			if(max_x < x[i]) max_x = x[i];
		max_x++;
		
		for(int i = 0; i < M; i++)
			if(min_y > y[i]) min_y = y[i];
		
		boolean ans = false;
		if(X <= Y && max_x <= min_y && ((Y >= max_x && Y <= min_y) || (min_y >= X && min_y <= Y))) ans = true;
		
		System.out.println(ans?"No War":"War");
	}
}