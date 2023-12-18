import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int[][] matrix_mul(final int n, final int mod, int[][] a, int[][] b){
		int[][] ret = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0;j < n; j++){
				int sum = 0;
				
				for(int k = 0; k < n; k++){
					sum += (a[i][k]* b[k][j])  % mod;
					sum %= mod;
				}
				
				ret[i][j] = sum % mod;
			}
		}
		
		return ret;
	}
	
	public static int[][] matrix_pow(final int n, final int mod, final int t, int[][] ret){
		if(t == 1){
			return ret;
		}
		
		int[][] tmp = matrix_pow(n, mod, t / 2, ret);
		int[][] tmp_2 = matrix_mul(n, mod, tmp, tmp);
		
		if(t % 2 == 0){
			return tmp_2;
		}else{
			return matrix_mul(n, mod, tmp_2, ret);
		}
	}
	
	public static int[] vec_max_mul(final int n, final int mod, int[] array, int[][] matrix){
		int[] ret = new int[n];
		
		for(int i = 0; i < n; i++){
			int sum = 0;
			
			for(int j = 0;j < n; j++){
				sum += (array[j] * matrix[j][i]) % mod;
				sum %= mod;
			}
			
			ret[i] = sum;
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			final int t = sc.nextInt();
			
			if(n == 0 && m == 0 && a == 0 && b == 0 && c == 0 && t == 0){
				break;
			}
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			int[][] matrix = new int[n][n];
			for(int i = 0; i < n; i++){
				if(i != 0){
					matrix[i-1][i] = a;	
				}
				
				matrix[i][i] = b;
				
				if(i != n-1){
					matrix[i+1][i] = c;
				}
			}
			/*
			for(int[] tmp : matrix){
				System.out.println(Arrays.toString(tmp));
			}
			*/
			int[] ret = null;
			if(t == 0){
				ret = array;
			}else{
				ret = vec_max_mul(n, m, array, matrix_pow(n, m, t, matrix));
			}
			
			
			boolean first = true;
			for(int i = 0; i < n; i++){
				if(first){
					System.out.print(ret[i]);
					first = false;
				}else{
					System.out.print(" " + ret[i]);
				}
			}
			
			System.out.println();
		}
		
	}

}