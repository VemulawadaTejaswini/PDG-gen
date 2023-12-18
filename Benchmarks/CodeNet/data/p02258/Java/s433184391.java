

import java.util.*;
public class Main {

	
	public static int computeMax(int[] arr) {
		int profit = -999999999;
		for(int i = 0; i <arr.length; i++) {
			for(int j = i +1 ; j < arr.length ; j++) {
				if(arr[j] - arr[i] > profit) {
					profit = arr[j] - arr[i];
				}
			}
		}
		return profit; 
	}
	
	public static int max(int a, int b) {
		if(a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int computeMaxDP(int[] arr) {
		int[][] memory = new int[arr.length][arr.length];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
				}
				memory[i][j] = max(max(memory[i][j-1], arr[j] - min), memory[i-1][j]); 
				//System.out.println(memory[i][j]);
				//System.out.println(min);
				//System.out.println(i + ", " + j);
				
			}
		}
		return memory[arr.length-1][arr.length-1];
	}
	
	public static int computeMaxDPother(int[] arr) {
		int minValue = arr[0];
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i] - minValue) {
				max = arr[i] - minValue;
			}
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i < size; i++) {
			arr[i] = in.nextInt();
		}
		int profit = computeMaxDPother(arr);
		System.out.println(profit);
	}
}
