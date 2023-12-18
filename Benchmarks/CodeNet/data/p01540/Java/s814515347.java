import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		
		int x_base[] = new int[n];
		int y_base[] = new int[n];
		for(int i = 0; i < n; i++){
			x_base[i] = sc.nextInt();
			y_base[i] = sc.nextInt();
		}
		
		TreeSet<Integer> x_set = new TreeSet<Integer>();
		TreeSet<Integer> y_set = new TreeSet<Integer>();
		for(int i = 0; i < n; i++){
			x_set.add(x_base[i]);
			y_set.add(y_base[i]);
		}
		
		int[] x_array = new int[x_set.size()];
		for(int i = 0; i < x_array.length; i++){
			x_array[i] = x_set.pollFirst();
		}
		
		int[] y_array = new int[y_set.size()];
		for(int i = 0; i < y_array.length; i++){
			y_array[i] = y_set.pollFirst();
		}
		
		int col[][] = new int[x_array.length][y_array.length];
		for(int i = 0; i < n; i++){
			col[Arrays.binarySearch(x_array,x_base[i])][Arrays.binarySearch(y_array,y_base[i])]++;
		}
		
		int[][] pre = new int[x_array.length][y_array.length];
		for(int i = 0; i < x_array.length; i++){
			for(int j = 0; j < y_array.length; j++){
				
				if(i != 0 && j != 0){
					pre[i][j] = pre[i-1][j] + pre[i][j-1] - pre[i-1][j-1]  + col[i][j];
				}else if(i != 0){
					pre[i][j] = pre[i-1][j] + col[i][j];
				}else if(j != 0){
					pre[i][j] = pre[i][j-1] + col[i][j];
				}else{
					pre[i][j] = col[i][j];
				}
			}
		}
		/* ok */
		
//		for(int i = 0; i < x_array.length; i++){
//			for(int j = 0; j < y_array.length; j++){
//				System.out.print(pre[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < m; i++){
			final int x1 = sc.nextInt();
			final int y1 = sc.nextInt();
			final int x2 = sc.nextInt();
			final int y2 = sc.nextInt();
			
			
			int x1_b = Arrays.binarySearch(x_array, x1);
			int y1_b = Arrays.binarySearch(y_array, y1);
			int x2_b = Arrays.binarySearch(x_array, x2);
			int y2_b = Arrays.binarySearch(y_array, y2);
			
			
			
			x1_b = x1_b < 0 ? -x1_b - 1 : x1_b;
			y1_b = y1_b < 0 ? -y1_b - 1 : y1_b;

			x2_b = x2_b < 0 ? -x2_b - 2 : x2_b;
			y2_b = y2_b < 0 ? -y2_b - 2 : y2_b;
			
			int sum = 0;
			
			//x2_b = x2_b >= x_array.length ? x_array.length-1 : x2_b;
			//y2_b = y2_b >= y_array.length ? y_array.length-1 : y2_b;
			/*
			System.out.println(Arrays.toString(x_array));
			System.out.println(x_array.length + "," + x1_b);
			System.out.println(Arrays.toString(y_array));
			System.out.println(y_array.length + "," + y1_b);
			System.out.println(Arrays.toString(x_array));
			System.out.println(x_array.length + "," + x2_b);
			System.out.println(Arrays.toString(y_array));
			System.out.println(y_array.length + "," + y2_b);
			*/
			if(x1_b > x2_b || y1_b > y2_b){
				sum = 0;
			}else if(x1_b != 0 && y1_b != 0){
				sum = pre[x2_b][y2_b] - pre[x1_b-1][y2_b-1] - pre[x2_b-1][y1_b-1] + pre[x1_b-1][y1_b-1];
			}else if(x1_b != 0){
				sum = pre[x2_b][y2_b] - pre[x1_b-1][y2_b];
			}else if(y1_b != 0){
				sum = pre[x2_b][y2_b] - pre[x2_b][y1_b-1];
			}else{
				sum = pre[x2_b][y2_b];
			}
			
			System.out.println(sum);
		}
		
		
	}
	
}