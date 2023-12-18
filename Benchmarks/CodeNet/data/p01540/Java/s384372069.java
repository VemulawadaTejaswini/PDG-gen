import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		
		long[] xs = new long[n];
		long[] ys = new long[n];
		
		TreeSet<Long> x_set = new TreeSet<Long>();
		TreeSet<Long> y_set = new TreeSet<Long>();
		
		for(int i = 0; i < n ; i++){
			xs[i] = sc.nextLong();
			ys[i] = sc.nextLong();
			x_set.add(xs[i]);
			y_set.add(ys[i]);
		}
		
		x_set.add(Long.MIN_VALUE); y_set.add(Long.MIN_VALUE);
		x_set.add(Long.MIN_VALUE + 1); y_set.add(Long.MIN_VALUE + 1);
		x_set.add(Long.MAX_VALUE - 1); y_set.add(Long.MAX_VALUE - 1);
		x_set.add(Long.MAX_VALUE); y_set.add(Long.MAX_VALUE);
		ArrayList<Long> x_list = new ArrayList<Long>(x_set);
		ArrayList<Long> y_list = new ArrayList<Long>(y_set);
		
		
		final int y_size = y_list.size();
		final int x_size = x_list.size();
		long[][] map = new long[y_size][x_size];
		
		for(int i = 0; i < n; i++){
			final int x_index = Collections.binarySearch(x_list, xs[i]);
			final int y_index = Collections.binarySearch(y_list, ys[i]);
			
			map[y_index][x_index]++;
		}
		
		/*
		System.out.println();
		for(int i = 0; i < y_size; i++){
			for(int j = 0; j < x_size; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		for(int i = 0; i < y_size; i++){
			for(int j = 0; j < x_size; j++){
				if(i != 0){
					map[i][j] += map[i - 1][j];
				}
				
				if(j != 0){
					map[i][j] += map[i][j - 1];
				}
				
				if(i != 0 && j != 0){
					map[i][j] -= map[i-1][j-1];
				}
			}
		}
		
		//     0   1    2
		//  -1  -2   -3
		for(int i = 0; i < m; i++){
			final long lx = sc.nextLong();
			final long ly = sc.nextLong();
			final long hx = sc.nextLong();
			final long hy = sc.nextLong();
			
			int lx_index = Collections.binarySearch(x_list, lx);
			if(lx_index < 0){
				lx_index = -(lx_index + 1);
			}
			lx_index--;
			
			int hx_index = Collections.binarySearch(x_list, hx);
			if(hx_index < 0){
				hx_index = -(hx_index + 2);
			}
			
			int ly_index = Collections.binarySearch(y_list, ly);
			if(ly_index < 0){
				ly_index = -(ly_index + 1);
			}
			ly_index--;
			
			int hy_index = Collections.binarySearch(y_list, hy);
			if(hy_index < 0){
				hy_index = -(hy_index + 2);
			}
			
			//System.out.println(x_list);
			//System.out.println(lx_index + "," + ly_index + " <=>" + hx_index + ", " + hy_index);
			
			final long hh = map[hy_index][hx_index];
			final long hl = map[hy_index][lx_index];
			final long lh = map[ly_index][hx_index];
			final long ll = map[ly_index][lx_index];
			
			
			final long result = hh - hl - lh + ll;
			
			System.out.println(result);
		}
		
		
	}
}