import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		final int a = sc.nextInt() - 1;
		final int b = sc.nextInt() - 1;
		final int c = sc.nextInt() - 1;
		final int d = sc.nextInt() - 1;
		
		int min = Integer.MAX_VALUE;
		
		for(int w = 1; w <= 100; w++){
			final int a_x = a % w;
			final int a_y = a / w;
			final int b_x = b % w;
			final int b_y = b / w;
			final int c_x = c % w;
			final int c_y = c / w;
			final int d_x = d % w;
			final int d_y = d / w;
			
			int dist1 = Math.abs(a_x - b_x) + Math.abs(a_y - b_y);
			int dist2 = Math.abs(c_x - d_x) + Math.abs(c_y - d_y);
			
			//System.out.println(w + " " + dist1 + " " + dist2);
			
			min = Math.min(min, dist1 + dist2);
		}
		
		System.out.println(min);
	}

}